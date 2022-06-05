public class perulangan {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        int l = 1;
        while (l <= 9) {
            for (int k = 0; k < l; k++) {
                System.out.print(' ');
            }
            if (l < 5) {
                System.out.println(l);
            } else {
                System.out.println(5);
            }

            l++;
        }
        System.out.println();

        int j = 9;
        while (j >= 1) {
            System.out.print(j);
            j--;
        }
    }
}