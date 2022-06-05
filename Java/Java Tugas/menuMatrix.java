import java.util.Scanner;

public class menuMatrix {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("--------------------------------");
        System.out.println("[1] Matriks Transpose");
        System.out.println("[2] Mencari Luas Segitiga");
        System.out.println("[3] Selesai");
        System.out.println("--------------------------------");
        Scanner tukangScan = new Scanner(System.in);

        int keputusan = tukangScan.nextInt();
        switch(keputusan) {
            case 1:
        // Making Matrix and 
        int[][] orinijigen = new int[2][3];

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
    System.out.println("Matrix Transpose");
        for (int i = 0; i < newnijigen.length; i++) {
            for (int j = 0; j < newnijigen[i].length; j++) {
                System.out.print(newnijigen[i][j] + " ");
            }
            System.out.println();
        }
            break;
            case 2:
            System.out.println("Masukkan Panjang Alas");
        int alas = tukangScan.nextInt();

        System.out.println("Masukkan Tinggi");
        int tinggi = tukangScan.nextInt();

        int luasSegitiga = (alas * tinggi)/2;
        System.out.println("Luas Segitiga = " + luasSegitiga);
            break;

            case 3:

            break;
        }
    }
}