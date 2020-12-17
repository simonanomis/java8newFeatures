package methodReferenceDoubleColon;

public class MultiThreadImplementations {
    public static void main(String[] args) {
        //lambda concept
        Runnable thread1 = () -> {
            for(int i= 0; i<10; i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(thread1);
        t.start();
        for(int i= 0; i<10; i++) {
            System.out.println("main thread");
        }

        //method reference concept
        MultiThreadImplementations multiThreadImplementations = new
                MultiThreadImplementations();
        Runnable thread2 = multiThreadImplementations::threadMethod;
        Thread t2 = new Thread(thread2);
        t2.start();
        for(int i= 0; i<10; i++) {
            System.out.println("main thread");
        }
    }

    public void threadMethod() {
        for(int i= 0; i<10; i++) {
            System.out.println("child thread");
        }
    }
}
