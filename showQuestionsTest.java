package pa2;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

/**
 * testing showing the questions to the user
 */
class showQuestionsTest {

  Appendable app = new StringBuilder();
Question q;
  showQuestionsAndMenu show;
  @BeforeEach
  void setUp() {
    q = new Question();
    q.question = "what's earth?";
    q.type = " /H";
    show = Mockito.mock(showQuestionsAndMenu.class);

  }

  @Test
  void getAnswer() {
    show.getAnswer(q);
    Mockito.verify(show);
  }

  @Test
  void getMenu() {
    show.getMenu();
    Mockito.verify(show);
  }
}