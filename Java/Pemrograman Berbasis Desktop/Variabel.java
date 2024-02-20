public class Variabel { // class
    int umur = 21; // instance variabel
    String nama = "Ryo"; // instance variabel like public variabel
    public Variabel() { // method
    int umur = 21; // Local variabel
    String nama = "Ryo"; // Local variabel
    System.out.println(nama);
    System.out.println(umur);
}
    public static void main(String[] args) {
        new Variabel();
    }
}
