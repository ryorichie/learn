public class Main {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'S';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString() method that use to convert wrapper object to String
        String myString = myInt.toString();
        System.out.println(myString);
    }
}

/**
 * following methods are used to get the value associated with the corresponding
 * wrapper object: intValue(), byteValue(), shortValue(), longValue(),
 * floatValue(), doubleValue(), charValue(), booleanValue()
 */

/**
 * 
 * Primitive Data Type Wrapper Class
 * byte Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * boolean Boolean
 * char Character
 */