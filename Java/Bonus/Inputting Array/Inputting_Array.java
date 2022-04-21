import java.util.Scanner;

public class Inputting_Array {
    public static void main(String[] args) {
        int[] prime = new int[5];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukan bilangan prima ke " + i);
            prime[i] = myObj.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(prime[i]);
        }
    }
}
// make an array
// and input it with console
