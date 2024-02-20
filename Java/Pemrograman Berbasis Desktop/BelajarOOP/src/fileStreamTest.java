import java.io.*;
import java.io.IOException;

public class fileStreamTest {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Masukan karakter, ketik q untuk berhenti");
            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            } while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
