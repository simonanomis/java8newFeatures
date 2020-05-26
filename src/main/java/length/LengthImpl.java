package length;

public class LengthImpl implements LengthInterf {
    @Override
    public int getLength(String word) {
        return word.length();
    }
}
