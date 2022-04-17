import java.util.*; // Import scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName);

    }
}

/// Input Types
/**
 * nextBoolean(), Reads a boolean value from the user
 * nextByte(), Reads a byte value from the user
 * nextDouble(), Reads a double value from the user
 * nextFloat(), Reads a float value from the user
 * nextInt(), Reads a int value from the user
 * nextLine(), Reads a String value from the user
 * nextLong(), Reads a long value from the user
 * nextShort(), Reads a short value from the user
 */