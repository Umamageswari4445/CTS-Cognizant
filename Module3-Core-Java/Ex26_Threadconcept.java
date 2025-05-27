
    class MyRunnable implements Runnable {
    private String message;

    public MyRunnable(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500); // pause for readability
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Ex26_Threadconcept {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1 is running"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2 is running"));

        thread1.start();
        thread2.start();
    }
}


