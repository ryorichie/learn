public class kayaknyaGini {
    public static void main(String[] args) {
        int sumGanjil = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 10) == 0) {
                int sum = 0;
                for(int j = i; j > i-5; j--) {
                    sum = sum + j;
                }
                sumGanjil = sumGanjil + sum;
                System.out.print(sum + " \n");
            } else if ((i % 5) == 0) {
                int sum = 0;
                for(int j = i; j > i-5; j--) {
                    sum = sum + j;
                }
                System.out.print(sum + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nJumlah setiap jumlah yang bernilai ganjil dari setiap keliapatan 5 : " + sumGanjil);
    }
}
