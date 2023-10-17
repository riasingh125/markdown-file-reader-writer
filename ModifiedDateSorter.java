package pa2;

import java.nio.file.Path;
import java.util.Comparator;


/**
 * represents sorting by modification date
 */
public class ModifiedDateSorter implements Comparator<Path> {

  /**
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return int based on if the first file is greater than, less than, or equal to the second file
   */
  @Override
  public int compare(Path o1, Path o2) {
    return Long.compare(o1.toFile().lastModified(), o2.toFile().lastModified());
  }
}
