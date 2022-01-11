import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionTest {
    @Test
    public void test() {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } finally {
            System.out.println("Finally caught.");
        }
    }

    @Test
    public void testMoreCatch() {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e1) {
            System.out.println("ArithmeticException caught.");
        }  catch (Exception e2) {
            fail();
        } finally {
            System.out.println("Finally caught.");
        }
    }

    @Test
    public void testAlwaysFinally1() {
        try {
            int i = 1 / 1;
        } catch (ArithmeticException e1) {
            fail();
        }  catch (Exception e2) {
            fail();
        } finally {
            System.out.println("Finally caught.");
        }
    }

    @Test
    public void testAlwaysFinally2() {
        try {
            int i = 1 / 1;
            return;
        } finally {
            System.out.println("Finally caught.");
        }
    }

    @Test
    @Disabled
    public void testExit1() {
        try {
            System.exit(0);
        } finally {
            fail();
        }
    }

    @Test
    @Disabled
    public void testExit2() {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.exit(0);
        } finally {
            fail();
        }
    }

    @Test
    public void testError() {
        try {
            testError();
        } catch (StackOverflowError e) {
            System.out.println("Error caught.");
        } finally {
            System.out.println("Finally caught.");
        }
    }
}
