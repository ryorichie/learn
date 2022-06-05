import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        // Making Matrix and 
        int[][] orinijigen = new int[2][3];
        Scanner tukangScan = new Scanner(System.in);

        // Inputting Old Mattric
        System.out.println("Tolong input matrix");
        for (int i = 0; i < orinijigen.length; i++) {
            for (int j = 0; j < orinijigen[i].length; j++) {
                System.out.println("Matrix baris (" + i + ") Kolom (" + j + ")");
                orinijigen[i][j] = tukangScan.nextInt();
            }
        }

        // Println Old Matrix
    System.out.println("Matrix Original");
        for (int i = 0; i < orinijigen.length; i++) {
            for (int j = 0; j < orinijigen[i].length; j++) {
                System.out.print(orinijigen[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Transpose to New Array
        int[][] newnijigen = new int[orinijigen[0].length][orinijigen.length];
        for (int i = 0; i < newnijigen.length; i++) {
            for (int j = 0; j < newnijigen[0].length; j++) {
                newnijigen[i][j] = orinijigen[j][i];
            }
        }
        // Println New Matrix
    System.out.println("Matrix Original");
        for (int i = 0; i < newnijigen.length; i++) {
            for (int j = 0; j < newnijigen[i].length; j++) {
                System.out.print(newnijigen[i][j] + " ");
            }
            System.out.println();
        }

    }
}