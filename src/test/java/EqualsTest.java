import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class EqualsTest {
  @Test
  void testLong() {
    assertTrue(19l == 19l);
    assertTrue(19l == Long.valueOf(19));
    assertFalse(Long.valueOf(128) == Long.valueOf(128));
    assertTrue(Long.valueOf(127) == Long.valueOf(127));  // ! -127 - +127
    assertTrue(Long.valueOf(-127) == Long.valueOf(-127));

    assertTrue(Long.valueOf(128).equals(128L));
    assertNotNull(Map.of(Long.valueOf(128), "test").get(128L));

    assertTrue(Long.valueOf(128).equals(Long.valueOf(128)));
    assertNotNull(Map.of(Long.valueOf(128), "test").get(Long.valueOf(128)));

    assertFalse(Long.valueOf(128).equals(128));
    assertTrue(Long.valueOf(128).equals((long) 128));
  }
}
