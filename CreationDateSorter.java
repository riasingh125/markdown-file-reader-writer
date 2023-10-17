package pa2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/**
 * represents sorting by creation date of a file
 */
public class CreationDateSorter implements Comparator<Path> {

  /**
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return an integer based on which creation time is bigger/older
   */

  @Override
  public int compare(Path o1, Path o2) {
    BasicFileAttributes attr = null;
    BasicFileAttributes att = null;
    try {
      attr = Files.readAttributes(o1, BasicFileAttributes.class);
      att = Files.readAttributes(o2, BasicFileAttributes.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    FileTime ctime1 = attr.creationTime();
    FileTime ctime2 = att.creationTime();

    long time1 = ctime1.to(TimeUnit.MILLISECONDS);
    long time2 = ctime2.to(TimeUnit.MILLISECONDS);
    return Long.compare(time1, time2);
  }

}