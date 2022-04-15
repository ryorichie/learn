abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from main)
class Student extends Main {
    public int graduationYear = 2021;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
