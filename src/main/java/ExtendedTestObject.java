public class ExtendedTestObject extends TestObject {
    public static void test() {
        System.out.println("Hello static from extended!");
    }

    @Override
    public void testNotStatic() {
        System.out.println("Hello extended not static!");
        super.testNotStatic();
    }
}