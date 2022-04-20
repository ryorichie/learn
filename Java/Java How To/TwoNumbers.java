import java.util.Scanner; // Import the Scanner class

public class TwoNumbers {
    public static void main (String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create scanner object
        System.out.println("Type Number");
        x = myObj.nextInt(); // Read user input

        System.out.println("Another Number");
        y = myObj.nextInt(); // Read user input

        sum = x + y;
        System.out.println(sum);
    }
}
