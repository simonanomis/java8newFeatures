@FunctionalInterface
public interface FunctionalInterfaceChild extends  FunctionalInterface1{

    void m1();

    @Override
    default void m2() {

    }
}
