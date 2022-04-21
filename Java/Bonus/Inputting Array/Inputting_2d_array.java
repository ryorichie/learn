import java.util.Scanner;

public class Inputting_2d_array {
    public static void main(String[] args) {
        int[][] nijigen = new int[5][5];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nijigen[i][j] = myObj.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(nijigen[i][j]);
            }
        }
    }
}
// make an nijigen array