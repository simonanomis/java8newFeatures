package consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello");
        stringConsumer.accept("World");
    }
}
