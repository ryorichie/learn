public class java_for_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /**
         * Statement 1 is executed (one time) before the execution of the code block.
         * Statement 2 defines the condition for executing the code block.
         * Statement 3 is executed (every time) after the code block has been executed.
         */

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
