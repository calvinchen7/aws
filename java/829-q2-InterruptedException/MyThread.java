public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            // Perform some task
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Handle the exception
            System.out.println("Interrupted");
            return;
        }

        // Continue executing
    }
}
