package pa2;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * represents what delegates to the model and view, main class called in driver
 */
public class Control {

  private Readable read;
  private Scanner userInput;

  Control() {
    read = new InputStreamReader(System.in);
    userInput = new Scanner(read);
  }

  Control(Readable read) {
    this.read = read;
    userInput = new Scanner(read);
  }


  /**
   * called in driver, and calls methods in control
   */
  public void run() {
    Start.startProgram();
    this.controlQs();

  }

  /**
   * @return String : file path user typed in
   */
  public String pathToFile() {
    Start.pathToSr();
    String path = userInput.nextLine();
    return path;
  }

  /**
   * @return integer of the number of questions the user wants
   */
  public int questionCounting() {
    Start.questionCount();
    String questionCount = userInput.nextLine();
    return Integer.parseInt(questionCount);
  }

  /**
   * represents showing the user the questions and getting menu input
   */
  public void controlQs() {
    ProcessingQs process = new ProcessingQs();
    process.showingQsAndMenuOp();
  }


  /**
   * @param option : represents what the user typed in as an option
   * @param q      : represents a question to be manipulated/accessed
   */
  public void choices(String option, Question q) {
    int optInt = Integer.parseInt(option);
    Choices choice = Choices.values()[optInt - 1];
    if (choice == Choices.EASY || choice == Choices.HARD) {
      q.changeType(optInt);
    } else if (choice == Choices.ANSWER) {
      System.out.println(q.answer);
    } else if (choice == Choices.EXIT) {
      FinalScreen.showFinalScreen();
    } else if (choice == Choices.CHANGE) {
      q.changeAnswer(optInt);
    }
  }


  /**
   * @param q : takes in a question to be manipulated/accessed in the choices method
   * @return String based on what the user wants to do next
   */
  public String menuOptions(Question q) {
    showQuestionsAndMenu.getMenu();
    String menuOption = userInput.nextLine();
    choices(menuOption, q);
    return menuOption;
  }

  /**
   * @param q : represents a question
   * @return String: based on the user's answer
   */
  public String getAnswers(Question q) {
    showQuestionsAndMenu.getAnswer(q);
    String answer = userInput.nextLine();
    return answer;
  }
}
