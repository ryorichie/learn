public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished");
        }

        checkAge(20);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted - you are old enough!");
        }
    }
}

// Java Exception
/**
 * When executing Java code, different errors can occur: coding errors made by
 * the programmer, errors due to wrong input, or other unforeseeable things.
 */

// Syntax try and catch
/**
 * // try {
 * // // Block of code to try
 * // }
 * // catch(Exception e) {
 * // // Block of code to handle errors
 * // }
 */