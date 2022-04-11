public class for_each_loop {
    public static void main(String[] args) {

        // Syntax
        /**
         * for (type variableName : arrayName) {
         * // code block to be executed
         * }
         */
        String[] music_genre = { "rock", "sliceoflife", "pop", "k-pop" };
        for (String i : music_genre) {
            System.out.println(i);
        }
    }
}
