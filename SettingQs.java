package pa2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Represents creating and setting each field of a question
 */
public class SettingQs extends Question {

  /**
   * @param file -> inputted sr file
   * @return ArrayList<Question>
   */
  public static ArrayList<Question> settingType(File file) {
    ArrayList<String> fromFile = readingsrFile(file);
    ArrayList<Question> totalqs = new ArrayList<>();
    int start = 0;
    for (String line : fromFile) {
      for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (Character.isLetter(c)) {
          start = i;
          Question q = new Question();
          int end = line.indexOf(":");
          int type = line.indexOf("/");
          q.question = line.substring(start, end);
          q.answer = line.substring(end, type);
          q.type = line.substring(type);
          totalqs.add(q);
          break;
        }
      }

    }
    return totalqs;

  }

  /**
   * @param file : path to sr file
   * @return ArrayList<String> of all of the lines in the file
   */
  private static ArrayList<String> readingsrFile(File file) {
    ArrayList<String> lines = new ArrayList<>();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line;
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;

  }

}
