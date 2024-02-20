import java.io.*;

public class CreateDir {
    public static void main (String args[]) {
        String dirname = "C:/Users/ryori/Documents/GitHub/learn/Java/Pemrograman Berbasis Desktop/BelajarOOP/src/langit";
        File d = new File(dirname);
        d.mkdir();
    }
}