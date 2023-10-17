package pa2;

/**
 * represents the final screen the user sees
 */
public class FinalScreen implements View {

  private Appendable append;

  FinalScreen() {
  }

  FinalScreen(Appendable append) {
    this.append = new StringBuilder();
  }


  /**
   * prints the stats of the study session
   */
  public static void showFinalScreen() {
    System.out.println("Study Session Over! Here are your stats: ");
    System.out.println("# of Qs that went from easy to hard: ");
    System.out.println(Question.EasyToHard);
    System.out.println("# of Qs that went from hard to easy: ");
    System.out.println(Question.HardToEasy);
    System.out.println("# of Qs that are currently hard ");
    System.out.println(Question.newHard);
    System.out.println("# of Qs that are currently easy");
    System.out.println(Question.newEasy);
  }
}
