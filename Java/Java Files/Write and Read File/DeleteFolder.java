import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File ("C:\\Users\\Ryo Richie\\Documents\\GitHub\\learn\\Java\\Java Files\\Write and Read File\\Folder");
        if (myObj.delete()) {
            System.out.println(myObj.getName() + " Deleted");
        } else {
            System.out.println(" Failed");
        }
    }
}
