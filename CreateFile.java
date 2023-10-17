package pa2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * represents creating a new file
 */
public class CreateFile {

  /**
   * @param path which is a path to be written on
   * @return File which is the file to be written on
   */
  public File create(Path path) {
    File newFile = new File(path.toString());
    return newFile;

  }

  public static File createSr(File fil) {
    String nameBig = fil.toString();
    String nameReal = nameBig.substring(0, nameBig.length() - 3);

    File file = new File(nameReal + ".sr");

    return file;
  }


}

