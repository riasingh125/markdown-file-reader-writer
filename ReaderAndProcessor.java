package pa2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * represents reading and processing a file
 */
public class ReaderAndProcessor {

  /**
   * @param pat ArrayList of .md file paths to be read
   * @return String of all of the important information
   */
  public String readAllMd(ArrayList<Path> pat) {
    StringBuilder bill = new StringBuilder();
    Scanner scan = null;


    for (Path path : pat) {

      try {
        scan = new Scanner(path.toFile());

      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }

      while (scan.hasNext()) {
        int end = 0;
        String line = scan.nextLine();
        if (line.startsWith("#")) {
          bill.append(line);
          bill.append("\n");
        } else if (line.contains("[[")) {
          int start = line.indexOf("[[");

          if (line.contains("]]")) {
            end = line.indexOf("]]");
          } else if (scan.nextLine().contains("]]")) {
            end = scan.nextLine().indexOf("]]");
          }

          bill.append(" - " + line.substring(start + 2, line.length()));
          bill.append("\n");
        }

      }
    }

    return bill.toString();


  }


  /**
   * @param pat : takes in a list of .md files
   * @return String: represents all of the important phrases, including Qa
   */
  public static String newSrFile(ArrayList<Path> pat) {
    StringBuilder srSb = new StringBuilder();
    StringBuilder appending = new StringBuilder();
    for (Path p : pat) {
      String filePath = p.toString();
      try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
          if (line.contains("[[") && !line.contains("]]")) {
            while (!line.contains("]]")) {
              line += reader.readLine();
            }
            int start = line.indexOf("[[");
            int end = line.indexOf("]]");
            appending.append(line.substring(start + 2, end) + " /H" + "\n");
          } else if (line.contains("[[") && line.contains("]]")) {
            int start = line.indexOf("[[");
            int end = line.indexOf("]]");
            appending.append(line.substring(start + 2, end) + " /H" + "\n");
          }
        }

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return appending.toString();
  }


  /**
   * @param strings : represents the String of important information
   * @return String: returns only strings that are QandA
   */
  public static String checkingForSr(String strings) {
    StringBuilder newSr = new StringBuilder();
    String[] lines = strings.split("\\n");
    for (String s : lines) {
      if (s.contains(":::")) {
        newSr.append(s + "\n");
      }
    }
    return newSr.toString();
  }
}




