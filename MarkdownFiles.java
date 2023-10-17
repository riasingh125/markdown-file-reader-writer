package pa2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * represents traversing through the directory and what to do at each step
 */
public class MarkdownFiles implements FileVisitor<Path> {
  public ArrayList<Path> md = new ArrayList<Path>();

  /**
   * @param dir   a reference to the directory
   * @param attrs the directory's basic attributes
   * @return CONTINUE an instance of FileVisitResult that intends to continue down the file tree
   * @throws
   */
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    return CONTINUE;
  }

  /**
   * @param file  a reference to the file
   * @param attrs the file's basic attributes
   * @return CONTINUE to continue down the filetree and collect the .md files
   * @throws
   */
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    String name = file.getFileName().toString();
    if (name.endsWith(".md")) {
      md.add(file);
      System.out.println(name);
    }
    return CONTINUE;
  }

  /**
   * @param file a reference to the file
   * @param exc  the I/O exception that prevented the file from being visited
   * @return CONTINUE after printing an exception
   * @throws
   */
  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
    handlerForFail();
    return CONTINUE;
  }


  public FileVisitResult handlerForFail() {
    return CONTINUE;
  }

  /**
   * @param dir a reference to the directory
   * @param exc {@code null} if the iteration of the directory completes without
   *            an error; otherwise the I/O exception that caused the iteration
   *            of the directory to complete prematurely
   * @return CONTINUE
   * @throws
   */
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
    return CONTINUE;
  }
}
