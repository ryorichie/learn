public class java_ifelse_shorthand {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good Evening");
        }

        // Shorthand version
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }    
}
