public class java_break {
    public static void main(String[] args) {
        /// Break and continue in for loops
        for (int i = 0; i < 10; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

        /// Break and Continue in While loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
