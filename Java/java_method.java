public class java_method {
    public static void main(String[] args) {
        myMethod();
        margaPrinter("Ghozuuu");
        introduction(23, "Ghozuuu");
        int x = pangkatTiga(30);
        System.out.println(x);
        int y = Perkalian(20, 19);
        System.out.println(y);
        cekUmur(29);
        int myNum1 = timesMethod(20, 21);
        double myNum2 = timesMethod(20.5, 21.5);
        System.out.println(myNum1);
        System.out.println(myNum2);
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

    // Method with if..else
    static void cekUmur(int age) {
        if (age < 18) {
            System.out.println("Hoooo. Masih muda");
        } else {
            System.out.println("Tue Bangke");
        }
    }

    // Method Overloading
    // With this method can have same name with different parameters

    static int timesMethod(int x, int y) {
        return x + y;
    }

    static double timesMethod(double x, double y) {
        return x * y;
    }
}
