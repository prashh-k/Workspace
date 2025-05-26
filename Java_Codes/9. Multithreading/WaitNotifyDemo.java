//Coordinating a producer-consumer problem in messaging queues.
class WaitNotifyExample {
    private final Object lock = new Object();
    private boolean flag = false;

    public void producer() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Producer is producing...");
            flag = true;
            lock.notify();
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock) {
            while (!flag) {
                lock.wait();
            }
            System.out.println("Consumer consumed.");
        }
    }
}

public class WaitNotifyDemo {
    public static void executeWaitNotifyExample() {
        WaitNotifyExample example = new WaitNotifyExample();

        Thread producerThread = new Thread(() -> {
            try {
                example.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                example.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumerThread.start();
        producerThread.start();
    }

    public static void main(String[] args) {
        executeWaitNotifyExample();
    }
}

