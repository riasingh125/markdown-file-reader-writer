package pa2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * testing control class, delegating to all other classes
 */
final class ControlTest {

    Readable read = new StringReader(
        "5\n triedandtrueforsure.sr\n 1\n Argentina\n 1\n 3\n");

  Control c = new Control(read);

  @Test
   void run() {
  }

  @Test
  void questionCounting() {
    assertEquals(5, c.questionCounting());
  }
  @Test
  void pathToFile() {
    assertEquals("triedandtrueforsure.sr", c.pathToFile());
  }

  @Test
  void menuOptions() {
    Question q = new Question();
    Control c = new Control(read);
    assertEquals("1", c.menuOptions(q));
  }

  @Test
  void getAnswers() {
    Question q = new Question();
    Control c = new Control(read);
    assertEquals("Argentina", c.getAnswers(q));
  }

  @Test
  void controlQs() {
    Control controller = Mockito.mock(Control.class);
    controller.controlQs();
    Mockito.verify(controller);
  }

  @Test
  void choice1and2() {

  }


}