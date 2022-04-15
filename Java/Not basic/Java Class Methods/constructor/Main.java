public class Main {
    public static void main(String[]args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }

    // Creat a class attribut
    int x;

    // Create a class constructor for the Main class
    public Main() {
        x = 5; // set the initial value for the class attribut x
    }
}
