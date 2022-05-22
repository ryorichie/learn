import java.util.Random;

public class randomMatrix {
    public static void main(String[] args) {

        // Creating random 4 by 4 matrix
        Random r = new Random();
        int[][] a = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = r.nextInt(2);
            }
        }

        int[] b = new int[8];

        for (int i = 0; i < 4; i++) {
            int arraySum = 0;
            for (int j = 0; j < 4; j++) {
                arraySum = a[i][j] + arraySum;
            }
            b[i] = arraySum;
        }

        for (int i = 0; i < 4; i++) {
            int arraySum = 0;
            for (int j = 0; j < 4; j++) {
                arraySum = a[i][j] + arraySum;
            }
            b[i + 4] = arraySum;
        }

        System.out.println("1 x 1 Downsampling array:");
        for (int i = 0; i < 8; i++) {
            System.out.print(b[i] + " ");
        }
    }
}