package pa2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 * represents an object that writes to a file
 */
public class WriteToFile {


  /**
   * @param file given file to write to
   * @param str  given strings to add to the file
   * @return FileWriter
   */

  public static FileWriter write(File file, String str) {
    FileWriter wr = null;

    try {
      wr = new FileWriter(file);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    try {
      wr.write(str);
      wr.flush();
      wr.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return wr;

  }


  public static void writeToSr(File file, String qa) {
    FileWriter writeToSrFile = null;

    try {
      writeToSrFile = new FileWriter(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      writeToSrFile.write(qa);
      writeToSrFile.flush();
      writeToSrFile.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

