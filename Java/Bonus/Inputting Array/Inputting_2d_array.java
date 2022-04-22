import java.util.Scanner;

public class Inputting_2d_array {
    public static void main(String[] args) {
        int[][] nijigen = new int[3][3];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nijigen[i][j] = myObj.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(nijigen[i][j]);
            }
        }
    }
}
// make an nijigen array