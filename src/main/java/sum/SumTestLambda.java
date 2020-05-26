package sum;

public class SumTestLambda {
    public static void main(String[] args) {
        SumInterf sumInterf = (a, b) -> System.out.println(a+b);
        sumInterf.add(5, 8);
        sumInterf.add(10, 4);
    }
}
