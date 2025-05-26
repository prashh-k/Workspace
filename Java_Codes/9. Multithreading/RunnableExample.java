//Downloading files or processing network requests concurrently.
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void executeRunnableExample() {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
    }

    public static void main(String[] args) {
        executeRunnableExample();
    }
}
