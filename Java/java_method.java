public class java_method {
    public static void main(String[] args) {
        myMethod();
        margaPrinter("Ghozuuu");
        introduction(23, "Ghozuuu");
        int x = pangkatTiga(30);
        System.out.println(x);
        int y = Perkalian(20, 19);
        System.out.println(y);
    }

    static void myMethod() {
        System.out.println("Printing method");
    }

    // Parameters and Arguments
    static void margaPrinter(String firstName) {
        System.out.println(firstName + " " + "Gozali");
    }

    // Multiple Parameter
    static void introduction(int age, String name) {
        System.out.println(name + " is " + age + " Years old");
    }

    // Method that return value
    static int pangkatTiga(int x) {
        return x * x * x;
    }

    static int Perkalian(int x, int y) {
        return x * y;
    }
}
