public class java_arrays {
    public static void main(String[] args) {

        /// Declare and show array
        String[] fan_type = { "tragic", "saddy", "shaddy", "creepy" };
        int[] prime_number = { 2, 3, 5, 7, 11, 13 };

        System.out.println(fan_type[3]);
        System.out.println(prime_number[1]);

        /// Change an Array Element
        fan_type[1] = "Optimistic";
        System.out.println(fan_type[1]);

        /// Array Length
        System.out.println(fan_type.length);

        /// Loop Through an Array
        // For loop
        for (int i = 0; i < fan_type.length; i++) {
            System.out.println(fan_type[i]);
        }

        // For each
        for (String i : fan_type) {
            System.out.println(i);
        }

        // Multidimensional Arrays
        int[][] myNum = { { 2, 3, 5, 7, 11, 13 }, { 17, 19, 23 } };
        int x = myNum[0][2] * myNum[1][2];
        System.out.println(x);

        // Multidimensional for loops
        for (int i = 0; i < myNum.length; i++) {
            for (int j = 0; j < myNum[i].length; j++) {
                System.out.println(myNum[i][j]);
            }
        }
    }
}
