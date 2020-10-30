package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieConsumerTest {
    public static void main(String[] args) {
        ArrayList<MovieConsumer> movieConsumers = new ArrayList<>();
        populate(movieConsumers);

        Consumer<MovieConsumer> consumer = movieConsumer -> {
            System.out.println("Movie name: " + movieConsumer.name);
        };

        Consumer<MovieConsumer> consumer2 = movieConsumer -> {
            System.out.println("Movie hero: " + movieConsumer.hero);
        };

        Consumer<MovieConsumer> chainedConsumer = consumer.andThen(consumer2);
        movieConsumers.forEach(movieConsumer -> {
            chainedConsumer.accept(movieConsumer);
        });

    }

    private static void populate(ArrayList<MovieConsumer> movieConsumers) {
        movieConsumers.add(new MovieConsumer("movie1", "hero1", "heroine1"));
        movieConsumers.add(new MovieConsumer("movie2", "hero2", "heroine2"));
        movieConsumers.add(new MovieConsumer("movie3", "hero3", "heroine3"));

    }
}
