package pa2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * testing setting the part of every question
 */
class SettingQsTest {

  File file;
  @BeforeEach
  void setUp() throws IOException {
    file = File.createTempFile("temp", ".sr");
  }

  /**
   * testing the method settingType,
   */
  @Test
  void settingType() {
    ArrayList<Question> produce = SettingQs.settingType(file);

    assertEquals(0, produce.size());
  }
}