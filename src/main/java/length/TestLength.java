package length;

public class TestLength {
    public static void main(String[] args) {
        LengthInterf lengthInterf = new LengthImpl();
        System.out.println(lengthInterf.getLength("Baby Shmejbi"));
    }
}
