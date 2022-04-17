import java.time.*; // import the LocalDateTime class
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now(); // create a date object
        System.out.println("Before formatting : " + myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy mm:HH:ss");

        String formattedDate = myObj.format(myFormatObj);
        System.out.println("After formatting : " + formattedDate);
    }
}
