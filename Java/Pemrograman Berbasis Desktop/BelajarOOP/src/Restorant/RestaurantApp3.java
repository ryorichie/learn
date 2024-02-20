import java.util.ArrayList;
import java.util.Scanner;

// Kelas abstrak untuk MenuItem
abstract class MenuItem {
    private String nama;
    private double harga;
    private String kategori;

    public MenuItem(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    // Metode abstrak tampilMenu
    public abstract void tampilMenu();
}

// Kelas Makanan
class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga, "Makanan");
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " (" + jenisMakanan + ") - Rp " + getHarga());
    }
}

// Kelas Minuman
class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String nama, double harga, String jenisMinuman) {
        super(nama, harga, "Minuman");
        this.jenisMinuman = jenisMinuman;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " (" + jenisMinuman + ") - Rp " + getHarga());
    }
}

// Kelas Diskon
class Diskon extends MenuItem {
    private double diskon;

    public Diskon(String nama, double harga, double diskon) {
        super(nama, harga, "Diskon");
        this.diskon = diskon;
    }

    @Override
    public void tampilMenu() {
        System.out.println(getNama() + " - Diskon " + diskon + "%");
    }
}

// Kelas Menu
class Menu {
    private ArrayList<MenuItem> daftarMenu = new ArrayList<>();

    public void tambahMenu(MenuItem menuItem) {
        daftarMenu.add(menuItem);
    }

    public void tampilMenu() {
        System.out.println("Daftar Menu:");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).tampilMenu();
        }
    }

    public MenuItem getMenu(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            return daftarMenu.get(index);
        } else {
            throw new IllegalArgumentException("Menu tidak valid");
        }
    }

    public int getSize() {
        return daftarMenu.size();
    }
}

// Kelas Pesanan
class Pesanan {
    private ArrayList<MenuItem> pesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem menuItem) {
        pesanan.add(menuItem);
    }

    public void hapusPesanan(int index) {
        if (index >= 0 && index < pesanan.size()) {
            pesanan.remove(index);
        } else {
            throw new IllegalArgumentException("Pesanan tidak valid");
        }
    }

    public ArrayList<MenuItem> getPesanan() {
        return pesanan;
    }
}

// Kelas RestoranApp
public class RestaurantApp3 {
    private static Menu menu = new Menu();
    private static Pesanan pesanan = new Pesanan();

    public static void main(String[] args) {
        // Menambahkan menu makanan Indonesia
        menu.tambahMenu(new Makanan("Nasi Goreng", 25000, "Makanan Utama"));
        menu.tambahMenu(new Makanan("Sate Ayam", 30000, "Makanan Utama"));
        menu.tambahMenu(new Minuman("Es Teh Manis", 5000, "Minuman Dingin"));
        menu.tambahMenu(new Minuman("Es Jeruk", 6000, "Minuman Dingin"));

        // Implementasi menu utama
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pesan Makanan");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Hitung Total Biaya");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    menu.tampilMenu();
                    break;
                case 2:
                    pesanMakanan(scanner);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    hitungTotalBiaya();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void pesanMakanan(Scanner scanner) {
        System.out.println("Masukkan nomor menu yang ingin dipesan (0 untuk kembali):");
        menu.tampilMenu();
        System.out.print("Nomor menu: ");
        int nomorMenu = scanner.nextInt();
        if (nomorMenu > 0 && nomorMenu <= menu.getSize()) {
            MenuItem pesananItem = menu.getMenu(nomorMenu - 1);
            pesanan.tambahPesanan(pesananItem);
            System.out.println(pesananItem.getNama() + " berhasil ditambahkan ke pesanan.");
        } else if (nomorMenu == 0) {
            // Kembali ke menu utama
            return;
        } else {
            System.out.println("Nomor menu tidak valid.");
        }
    }

    private static void tampilkanPesanan() {
        System.out.println("Pesanan Anda:");
        ArrayList<MenuItem> pesananList = pesanan.getPesanan();
        for (int i = 0; i < pesananList.size(); i++) {
            System.out.print((i + 1) + ". ");
            pesananList.get(i).tampilMenu();
        }
    }

    private static void hitungTotalBiaya() {
        double totalBiaya = 0;
        ArrayList<MenuItem> pesananList = pesanan.getPesanan();

        for (MenuItem item : pesananList) {
            totalBiaya += item.getHarga();
        }

        double pajak = totalBiaya * 0.1;
        double biayaPelayanan = 20000;

        totalBiaya += pajak + biayaPelayanan;

        // Diskon 10% jika total biaya melebihi Rp 100.000
        if (totalBiaya > 100000) {
            totalBiaya *= 0.9;
            System.out.println("Anda mendapatkan diskon 10%!");
        }

        // Penawaran beli satu gratis satu untuk minuman jika total biaya melebihi Rp
        // 50.000
        if (totalBiaya > 50000) {
            for (MenuItem item : pesananList) {
                if (item instanceof Minuman) {
                    pesanan.tambahPesanan(item); // Tambahkan satu lagi
                    System.out.println("Anda mendapatkan penawaran beli satu gratis satu untuk minuman!");
                    break; // Hanya satu kali penawaran
                }
            }
        }

        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
