import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CastTest {
  @Test
  void test() {
    assertEquals(-1, (int)Long.MAX_VALUE);

    assertEquals(-1L, (int)Long.MAX_VALUE);

    assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + 1);
  }
}
