public class TestMain {


    //    //without lambda
//    public static void main(String[] args) {
//        FunctionalInterface1 in = new LambdaWithFunInterf();
//        in.m1();
//    }

    //with lambda
    public static void main(String[] args) {
        FunctionalInterface1 in = () -> System.out.println("Implements m1 method");
        in.m1();
    }
}
