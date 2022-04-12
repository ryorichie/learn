public class java_recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = sum1(10, 13);
        System.out.println(result1);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // A recursion can run into the problem of infinite recursion
    // To stop that. we need implement halting condition to the code

    public static int sum1(int start, int end) {
        if (end > start) {
            return end + sum1(start, end - 1);
        } else {
            return end;
        }
    }
}
