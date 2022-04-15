public class Main {
    public static void main(String[] args) {
        myMethod();

        // Calling static method
        mySMethod();

        // Calling public method
        Main myObj = new Main();
        myObj.myPMethod();
    }
    
    static void myMethod() {
        System.out.println("Hello Worlds");
    }

    // Static method
    static void mySMethod() {
        System.out.println("Static methods can be called without creating obejects");
    }

    // Public method
    public void myPMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
