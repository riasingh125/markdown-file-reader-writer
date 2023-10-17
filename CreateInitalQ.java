package pa2;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * class representings creating inital questions
 */
public class CreateInitalQ implements Model {

  private static Random rand = new Random();

  /**
   * @param wantedNumber : number representing how many questions the user wants to answer
   * @return ArrayList<Questions>
   */
  public static ArrayList<Question> createQs(int wantedNumber) {
    ArrayList<Question> total = readingLinesFromFile();
    ArrayList<Question> studySession = new ArrayList<Question>();
    for (int i = 0; i < wantedNumber; i++) {
      int choosing = rand.nextInt(total.size());
      Question q = total.get(choosing);
      studySession.add(q);
    }
    return studySession;
  }

  /**
   * @return ArrayList<Question>
   */
  public static ArrayList<Question> readingLinesFromFile() {
    Control c = new Control();
    String file = c.pathToFile();
    File newFile = new File(file);
    return SettingQs.settingType(newFile);
  }
}
