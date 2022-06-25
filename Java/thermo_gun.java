import java.util.Scanner;

public class thermo_gun {
    public static void main(String[] args) {
        float suhu;
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Mengecek Suhu Tubuh");
        suhu = myObj.nextInt(); 

        if (suhu < 37) {
            System.out.println("Normal");
        } else {
            System.out.println("Panas");
        }
    }
}
