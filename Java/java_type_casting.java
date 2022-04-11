public class java_type_casting {
    public static void main(String[] args) {
        /// Java Type Casting
        // Widening Casting (automatically) - converting a smaller type to a larger size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger rtpe to smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        /// Widening Casting
        int myInt = 12;
        double myDouble = myInt; // Automatic casting

        System.out.println(myInt);
        System.out.println(myDouble);

        /// Narrowing Casting
        double myWideDouble = 9.78d;
        int myNarrowInt = (int) myWideDouble; // Manual casting

        System.out.println(myWideDouble);
        System.out.println(myNarrowInt);
    }
}