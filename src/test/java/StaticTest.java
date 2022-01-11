import org.junit.jupiter.api.Test;

public class StaticTest {
    @Test
    public void call() {
        TestObject.test();
        ExtendedTestObject.test();
        new TestObject().testNotStatic();
        new ExtendedTestObject().testNotStatic();
    }
}
