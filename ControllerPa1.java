package pa2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

/**
 * represents the main method for PA1
 */
public class ControllerPa1 {
  /**
   * @param args : arguments including directory, sorting flag, and md file name
   */
  public static void controller(String[] args) {


    MarkdownFiles mk = new MarkdownFiles();

    try {
      Files.walkFileTree(Path.of(args[0]), mk);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    if (args[1].equals("filename")) {
      Collections.sort(mk.md, new FilenameSorter());


    } else if (args[1].equals("created")) {
      Collections.sort(mk.md, new CreationDateSorter());
    } else {
      Collections.sort(mk.md, new ModifiedDateSorter());
    }

    ReaderAndProcessor rd = new ReaderAndProcessor();
    String fileCreatedMD = rd.readAllMd(mk.md);
    CreateFile cr = new CreateFile();
    File filenew = cr.create(Path.of(args[2]));
    WriteToFile wtf = new WriteToFile();
    wtf.write(filenew, fileCreatedMD);

    generatingSr(filenew, mk);

  }


  /**
   * @param filenew : takes in the .md file to create the .sr file
   */
  private static void generatingSr(File filenew, MarkdownFiles mf) {
    ReaderAndProcessor sr = new ReaderAndProcessor();
    String qanda = sr.newSrFile(mf.md);
    String checkedsr = sr.checkingForSr(qanda);
    CreateFile srFileNew = new CreateFile();
    File newSrFile = srFileNew.createSr(filenew);
    WriteToFile writingToSr = new WriteToFile();
    writingToSr.writeToSr(newSrFile, checkedsr);

  }
}
