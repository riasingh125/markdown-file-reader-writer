package pa2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Represents a Question and changing of Question Fields
 */
public class Question {
  String question;
  String answer;
  String type;
  static int newEasy = 0;
  static int newHard = CreateInitalQ.readingLinesFromFile().size() - newEasy;
  static int EasyToHard = 0;
  static int HardToEasy = 0;


  Question() {

  }

  /**
   * @param optInt :the user Inputted choice
   *               returns void, just changed the question's type
   */
  public void changeType(int optInt) {
    Choices choice = Choices.values()[optInt - 1];
    if (choice == Choices.EASY) {
      this.type = " /E";
      newEasy += 1;
      HardToEasy += 1;

    } else if (choice == Choices.HARD) {
      this.type = " /H";
      newHard += 1;
      EasyToHard += 1;
    } else {
      throw new IllegalArgumentException("not a type");
    }
  }

  /**
   * @param choice void, changes the answer based on the user input
   */
  public void changeAnswer(int choice) {
    Choices choices = Choices.values()[choice - 1];
    if (choices == Choices.CHANGE) {
      Control c = new Control();
      this.answer = c.getAnswers(new Question());
      System.out.println(this.answer);
    }

  }

}
