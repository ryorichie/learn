public class fib {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int x = fibonacci(n - 1);
        int y = fibonacci(n - 2);

        return x + y;
    }
}
