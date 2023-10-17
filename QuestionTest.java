package pa2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * testing the different parts of the question
 */
class QuestionTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void changeType() {
    Question q = new Question();
    q.changeType(2);
    assertEquals(" /H", q.type);
    q.changeType(1);
    assertEquals(" /E", q.type);
  }

  @Test
  void changeAnswer() {
    Question q = new Question();
    q.changeAnswer(5);
    Mockito.verify(q);
  }
}