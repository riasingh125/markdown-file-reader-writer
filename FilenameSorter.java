package pa2;

import java.io.File;
import java.nio.file.Path;
import java.util.Comparator;


/**
 * represents sorting by filename lexographically
 */
public class FilenameSorter implements Comparator<Path> {

  /**
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return int based on name alphabetically
   */
  @Override
  public int compare(Path o1, Path o2) {
    File f1 = o1.toFile();
    File f2 = o2.toFile();
    return f1.compareTo(f2);
  }
}


