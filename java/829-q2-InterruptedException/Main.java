
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        // Interrupt the thread
        thread.interrupt();

        // Wait for the thread to finish
        thread.join();
    }
}