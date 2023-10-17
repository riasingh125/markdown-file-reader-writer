//package pa2;
//
//
//
//import java.io.IOException;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
///**
// * testing what happens once the program ends, when the user exits
// */
//class FinalScreenTest {
//
//  Appendable app = new StringBuilder();
//
// // FinalScreen final;
//
//  @BeforeEach
//  void setUp() throws IOException {
//    Question q = new Question();
//    q.EasyToHard = 0;
//    q.HardToEasy = 5;
//    q.newEasy = 10;
//    q.newHard = 0;
//
//
//    app.append("Study Session Over! Here are your stats: " + "\n");
//    app.append("# of Qs that went from easy to hard: " + "\n");
//    app.append(q.EasyToHard + "\n");
//    app.append("# of Qs that went from hard to easy: "+ "\n");
//    app.append(q.HardToEasy + "\n");
//    app.append("# of Qs that are currently hard " + "\n");
//    app.append(q.newHard + "\n");
//    app.append("# of Qs that are currently easy" + "\n");
//    app.append(q.newEasy + "\n");
//
//    final = Mockito.mock(FinalScreen.class);
//  }
//
//  @Test
//  void showFinalScreen() {
//    final.showFinalScreen();
//    Mockito.verify(final);
//  }
//}