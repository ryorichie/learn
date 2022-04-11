public class java_string {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTU";
        String helloworld = "Hello Worlds!";
        System.out.println("\r\nThe length of the string is" + txt); // String Length

        System.out.println("\r\n To Upper Case Method : " + helloworld.toUpperCase()); // Other String Method
        System.out.println("\r\n To Lower Case Method : " + helloworld.toLowerCase());

        String teks = "Ho ho ho sanata come"; // Finding character on the string
        System.out.println("\r\n come occurrence is on: " + teks.indexOf("come"));

        String firstName = "Ryo"; // String Concatenation
        String lastName = "Richie";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        /**
         * Java uses the + operator for both addition and concatenation. Numbers are
         * added. String are concatenated
         */

        String x = "10";
        int y = 20;
        String z = x + y; // String + Integer string String, integer can be converter to string but not
                          // vice versa
        System.out.println(z);

        // Special Character
        String sentence = "We are the so-called \"Vikings\" from the north.";
        String sentence2 = "It\'s alright";
        String sentence3 = "This character \\ is called backslash";

        System.out.println(sentence);
        System.out.println(sentence2);
        System.out.println(sentence3);
        /** backslash escape character
         *  Escape character	        Result	        Description
            \'	                        '	            Single quote
            \"	                        "	            Double quote
            \\	                        \               Backslash
         */

         /** Other escape sequences
          *     Code	    Result	
                \n	        New Line	
                \r	        Carriage Return	
                \t	        Tab	
                \b	        Backspace	
                \f	        Form Feed	
          */
    }
}