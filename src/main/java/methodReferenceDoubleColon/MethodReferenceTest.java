package methodReferenceDoubleColon;

public class MethodReferenceTest {
    public static void main(String[] args) {
        TestInterf testInterf1 = MethodReferenceTest::test2;
        testInterf1.test1();

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        TestInterf testInterf2 = methodReferenceTest :: test3;
        testInterf2.test1();
    }

    public static void test2() {
        System.out.printf("Test implementation for static method reference ");
    }

    public void test3() {
        System.out.println("Test impl for instance method reference");
    }
}
