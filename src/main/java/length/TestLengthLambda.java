package length;

public class TestLengthLambda {

    public static void main(String[] args) {
        LengthInterf lengthInterf = word -> word.length();
        System.out.println(lengthInterf.getLength("Baby Shmejbi"));
    }
}
