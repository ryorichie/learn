public class Concurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Concurrency thread = new Concurrency();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
