package runnable;

public class TestRunnable {

    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        //we need driver object
        Thread thread = new Thread(runnable);
        //till now we have only one thread, main thread
        //after start method we have 2 threads
        thread.start();
        //this code below is executed my main thread
        for (int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }
}
