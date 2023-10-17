package pa2;

import java.util.ArrayList;

/**
 * represents processing the questions and the menu options
 */
public class ProcessingQs implements Model {


  ProcessingQs() {

  }

  /**
   * shows the questions and checks the option the user typed in
   */
  public void showingQsAndMenuOp() {
    Control c = new Control();
    ArrayList<Question> theqs = CreateInitalQ.createQs(c.questionCounting());
    int i = 0;
    String choice = "";
    for (i = 0; i < theqs.size(); i++) {
      c.getAnswers(theqs.get(i));
      choice = c.menuOptions(theqs.get(i));
      if (choice.equals("4")) {
        break;
      }
      choice = c.menuOptions(theqs.get(i));

      if (choice.equals("4")) {
        break;
      }
    }
    FinalScreen.showFinalScreen();
  }
}
