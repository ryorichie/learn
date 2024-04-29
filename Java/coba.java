import java.util.Scanner;

public class coba {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nama Restoran : ");
        String RestoranA = input.nextLine();
        System.out.println("Input waktu kunjungan : ");
        String Waktu = input.nextLine();

        System.out.println("Input Menu Pertama : ");
        String Menu1 = input.nextLine();
        System.out.println("Beli Berapa : ");
        int Menu1Jumlah = input.nextInt();
        System.out.println("Berapa RB : ");
        int Menu1Harga = input.nextInt();

        input.nextLine();
        System.out.println("Input Menu Kedua : ");
        String Menu2 = input.nextLine();
        System.out.println("Beli Berapa : ");
        int Menu2Jumlah = input.nextInt();
        System.out.println("Berapa RB : ");
        int Menu2Harga = input.nextInt();

        int Total = (Menu1Jumlah * Menu1Harga) + (Menu2Jumlah * Menu2Harga);
        System.out.println("Albert needs " + Total + "Rupiah for buying" + Menu1Jumlah + " " + Menu1 + " and " + Menu2Jumlah + " " + Menu2 + " in " + RestoranA + " at " + Waktu);
    }
}
