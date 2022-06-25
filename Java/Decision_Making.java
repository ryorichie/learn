public class Decision_Making {
    public static void main(String[] args) {
        char Merek = 'B';
        String Ukuran = "M";
        int Harga;
        if (Merek == 'A' && Ukuran == "S") {
            Harga = 50000;
        } else if (Merek == 'A' && Ukuran == "M") {
            Harga = 75000;
        } else if (Merek == 'A' && Ukuran == "XL") {
            Harga = 100000;
        } else if (Merek == 'B' && Ukuran == "S") {
            Harga = 100000;
        } else if (Merek == 'B' && Ukuran == "M") {
            Harga = 200000;
        } else if (Merek == 'B' && Ukuran == "XL") {
            Harga = 300000;
        } else {
            Harga = 0;
            System.out.println("Error"); // in case if input wrong
        }

        System.out.println("Harganya Bajunya Rp. " + Harga);
    }
}
