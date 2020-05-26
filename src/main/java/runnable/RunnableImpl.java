package runnable;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        //Job of Thread
        //this code below is executed my child thread
        for (int i=0; i<10; i++) {
            System.out.println("Child Thread");
        }
    }
}
