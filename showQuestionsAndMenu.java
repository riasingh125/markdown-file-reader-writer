package pa2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * represents showing each question and the options to the user
 */
public class showQuestionsAndMenu implements View {

  private Appendable app;


  showQuestionsAndMenu() {
    app = new StringBuilder();
  }

  showQuestionsAndMenu(Appendable app) {
    this.app = app;
  }

  public ArrayList<Question> q = new ArrayList<Question>();

  /**
   * @param firstq : an object of the question class being passed in
   *               void but prints the question and the type and prompts the user to type in an answer
   */
  public static void getAnswer(Question firstq) {
    System.out.println(firstq.question + firstq.type);
    System.out.println("type in answer!" + "\n");
  }

  /**
   * void but prints the options to the user
   */
  public static void getMenu() {
    System.out.println("Option: type the corresponding number");
    System.out.println("1. set Easy");
    System.out.println("2. set Hard");
    System.out.println("3. see answer");
    System.out.println("4. Exit");
    System.out.println("5. change answer");

  }


}
