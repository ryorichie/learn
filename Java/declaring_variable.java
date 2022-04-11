public class declaring_variable {
    public static void main(String[] args) {
        // Declaring variable
        String firstname = "Ryo";
        String lastname = "Richie";
        System.out.println(firstname + lastname);

        int myNum = 15;
        myNum = 300;
        System.out.println(myNum);

        int x = 51;
        int y = 70;
        System.out.println(x + y);

        // Final Variables / const
        final int yourNum = 20;
        System.out.println(yourNum);

        // declaring all variable
        int myNumba = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // println
        System.out.println(myNumba);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // Declare Many Variables
        int a = 5;
        int b = 6;
        int c = 20;
        System.out.println(a + b + c);

        // One Value to Multiple Variables
        // int d = 2000, e = 2000, f = 2000;
        // code above work too
        int d, e, f;
        d = e = f = 2000;
        System.out.println(d + e + f);

        // Identifier rules
        /**
         * Names can contain letters, digits, underscores, and dollar signs
         * Names must begin with a letter
         * Names should start with a lowercase letter and it cannot contain whitespace
         * Names can also begin with $ and _ (but we will not use it in this tutorial)
         * Names are case sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */
    }
}