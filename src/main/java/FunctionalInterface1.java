//this is Functional Interface

@FunctionalInterface
public interface FunctionalInterface1 {

    //only 1 abstract method
    void m1();

    default void m2() {
    }
    static void m3() {
    }
}
