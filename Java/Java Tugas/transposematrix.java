import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        // Making Matrix and 
        int[][] orinijigen = new int[2][3];
        Scanner tukangScan = new Scanner(System.in);

        // Inputting Old Mattric
        for (int i = 0; i < orinijigen.length; i++) {
            for (int j = 0; j < orinijigen[0].length; j++) {
                orinijigen[i][j] = tukangScan.nextInt();
            }
        }

        // Println Old Matrix
    System.out.println("Matrix Original")
        for (int i = 0; i > orinijigen.length; i++) {
            for (int j = 0; i > orinijigen[0].length; i++) {
                system.out.println(orinijigen[i][j])
            }
        }

        // Matrix Transpose
        int[][] newnijigen = new int[orinijigen[0].length][orinijigen.length]
        for (int i = 0; i < newnijigen.length; i++) {
            for (int j = 0; j < newnijigen[0].length; j++) {
                newnijigen[i][j] = orinijigen[j][i];
            }
        }
        // New
    }
}