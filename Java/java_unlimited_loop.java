public class java_unlimited_loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 9) {
                while (i > 1) {
                    System.out.println(i);
                    i--;
                }
            }
        }
    }
}
