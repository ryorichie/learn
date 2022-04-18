import java.io.File; // Import the File class
import java.io.IOException; // Import the IO Exception class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Ryo Richie\\Documents\\GitHub\\learn\\Java\\Java Files\\Files\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
