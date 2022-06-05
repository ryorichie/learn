import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
      int[][] matrix = new int[2][3];
      Scanner tukangScan = new Scanner(System.in);

      // Inputting Old Mattric

      System.out.println("Tolong input matrix");
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              System.out.println("Matrix baris (" + i + ") Kolom (" + j + ")");
              matrix[i][j] = tukangScan.nextInt();
          }
      }

       for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
          for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
             System.out.print(matrix[i][j] + " ");
          }
          System.out.println(); //change line on console as row comes to end in the matrix.
       }

       System.out.println("Matrix Original");
       for (int i = 0; i > orinijigen.length; i++) {
           for (int j = 0; j > orinijigen[0].length; j++) {
               System.out.print(orinijigen[i][j] + " ");
           }
           System.out.println();
       }

    }
 }