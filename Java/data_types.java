public class data_types {
    public static void main(String[] args) {
        // int myNum = 5; // Integer
        // float myFloatNum = 5.99f; // Floating point number
        // char myLetter = 'r'; // Character
        // boolean myBool = true; // Boolean
        // String myText = "Hi"; // String

        /*
         * Data Type Size Description
         * byte 1 byte Stores whole numbers from -128 to 127
         * short 2 bytes Stores whole numbers from -32,768 to 32,767
         * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
         * decimal digits
         * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
         * digits
         * boolean 1 bit Stores true or false values
         * char 2 bytes Stores a single character/letter or ASCII values
         */

        // Integer Types
        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 30000;
        System.out.println(myShort);

        int myInteger = 10000000;
        System.out.println(myInteger);

        long myLong = 1000000000000000000L;
        System.out.println(myLong);

        // Floating Point Types
        float myFloat = 5.75f;
        System.out.println(myFloat);

        double myDouble = 19.392d;
        System.out.println(myDouble);
        // floating point number can also be a scientific number with e to indicate
        // power of 10
        float f1 = 35e3f;
        double d1 = 239e4d;
        System.out.println(f1);
        System.out.println(d1);

        // Boolean Types
        boolean falseValue = false;
        boolean trueValue = true;
        System.out.println(falseValue);
        System.out.println(trueValue);

        // Java characters
        char myExam = 'E';
        char ASCII1 = 112;
        char ASCII2 = 100;
        System.out.println(myExam);
        System.out.println(ASCII1);
        System.out.println(ASCII2);

        // Strings
        String greeting = "Hello World";
        System.out.println(greeting);

        // Non-primitives data types
        /** Non Primitive data types are called reference types */
    }
}
