import java.io.*;

public class ReadDir {
    public static void main (String args[]) {
        File file = null;
        String[] paths;
        try {
            file = new File("C:/AUsers/Aryori/ADocuments/AGitHub/Alearn/AJava/APemrograman Berbasis Desktop/ABelajarOOP/Asrc");
            paths = file.list();

            for(String path:paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}