package pa2;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

/**
 * testing processing user input of menu option and showing questions
 */
class ProcessingQsTest {

  ProcessingQs process;
  @BeforeEach
  void setUp() {
    process = Mockito.mock(ProcessingQs.class);
  }

  @Test
  void showingQsAndMenuOp() {
    process.showingQsAndMenuOp();
    Mockito.verify(process);
  }
}