public class java_scope {
    public static void main(String[] args) {
        
        // Code here cannot use x

        int x = 1000;

        // x can be use here
        System.out.println(x);
    }

    static void blockScoped() {
        // Code here Cannot use x

        { // This is a block

            // Code here Cannot use x

            int x = 2000;

            // code here can use x
            System.out.println(x);
        }// The block ends here

        // Code here Cannot use x
    }
}
