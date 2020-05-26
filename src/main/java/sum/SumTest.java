package sum;

public class SumTest {
    public static void main(String[] args) {
        SumInterf sumInterf = new SumImpl();
        sumInterf.add(5, 6);
    }
}
