import java.util.Scanner;

public class RestoranApp {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    abstract class MenuItem 
    public static String[] menuMakanan = {
            "nasi padang", "soto betawi", "mie ayam", "nasi goreng"
    };
    public static int[] hargaMenuMakanan = {
            25000, 20000, 15000, 20000
    };
    public static String[] menuMinuman = {
            "es teh", "es jeruk", "es kopi", "air mineral"
    };
    public static int[] hargaMenuMinuman = {
            5000, 5000, 6000, 4000
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu Pelanggan atau Admin
        System.out.println("Admin atau Pelanggan");
        System.out.println("1. Admin");
        System.out.println("2. Pelanggan");

        // Login Admin

        int admin = input.nextInt();

        // Mekanisme Admin Menu
        if (admin == 1) {
            System.out.println("Login Admin");
            System.out.print("Username: ");
            String username = input.next();
            System.out.print("Password: ");
            String password = input.next();
            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                System.out.println("Login successful!\n");
                int keluar;
                do {
                    System.out.println("Pilih menu yang ingin dirubah");
                    System.out.println("1. Menu Makanan");
                    System.out.println("2. Menu Minuman");
                    System.out.println("3. Back");

                    int change = input.nextInt();
                    int menuIndex;
                    if (change == 1) {
                        System.out.println("Pilih Menu Yang Ingin Di Ubah");
                        for (int i = 0; i < menuMakanan.length; i++) {
                            System.out.println((i + 1) + ". " + menuMakanan[i] + " (" + hargaMenuMakanan[i] + ")");
                        }
                        menuIndex = input.nextInt();
                        input.nextLine();
                        System.out.println("Masukan Nama Menu");
                        String menuBaru = input.nextLine();
                        menuMakanan[menuIndex - 1] = menuBaru;
                        System.out.println("Masukan Harga Menu");
                        int hargaMenuBaru = input.nextInt();
                        hargaMenuMakanan[menuIndex - 1] = hargaMenuBaru;

                    } else if (change == 2) {
                        System.out.println("Pilih Menu Yang Ingin Di Ubah");
                        for (int i = 0; i < menuMinuman.length; i++) {
                            System.out.println((i + 1) + ". " + menuMinuman[i] + " (" + hargaMenuMinuman[i] + ")");
                        }
                        menuIndex = input.nextInt();
                        input.nextLine();
                        System.out.println("Masukan Nama Menu");
                        String menuBaru = input.nextLine();
                        menuMinuman[menuIndex - 1] = menuBaru;
                        System.out.println("Masukan Harga Menu");
                        int hargaMenuBaru = input.nextInt();
                        hargaMenuMinuman[menuIndex - 1] = hargaMenuBaru;

                    }

                    System.out.println("Masih Ingin Mengubah Menu");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    keluar = input.nextInt();

                } while (keluar < 2);
                System.out.println("Menu Restoran");
                System.out.println("------------------");
                System.out.println("Menu Makanan");
                for (int i = 0; i < menuMakanan.length; i++) {
                    System.out.println((i + 1) + ". " + menuMakanan[i] + " (" + hargaMenuMakanan[i] + ")");
                }
                System.out.println("Menu Minuman");
                for (int i = 0; i < menuMinuman.length; i++) {
                    System.out.println((i + 1) + ". " + menuMinuman[i] + " (" + hargaMenuMinuman[i] + ")");
                }

                System.out.println();

            } else {
                System.out.println("Login Failed, Going to Customer Menu");
            }
        }

        input.nextLine();
        // Tampilkan daftar menu
        System.out.println("Menu Restoran Baru");
        System.out.println("------------------");
        System.out.println("Menu Makanan");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i] + " (" + hargaMenuMakanan[i] + ")");
        }
        System.out.println("Menu Minuman");
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i + 1) + ". " + menuMinuman[i] + " (" + hargaMenuMinuman[i] + ")");
        }

        System.out.println();

        // Sistem Pemesanan
        int totalPesanan = 0;
        String[] pesanan = new String[0];
        String sentence = "";

        while (true) {
            System.out.println("Masukkan pemesanan Anda");
            System.out.println("Ketik selesai untuk mengakhiri");
            sentence = sentence + input.nextLine() + ",";
            int index = sentence.indexOf("selesai");
            if (index != -1) {
                break;
            }

        }
        sentence = sentence.replace(",,", ",");
        sentence = sentence.replace("selesai", "");

        // Penghitungan Total
        pesanan = sentence.split(",");
        for (String menu : pesanan) {
            String[] dataMenu = menu.split("=");
            int jumlah = Integer.parseInt(dataMenu[1].replace(" ", ""));

            for (int i = 0; i < menuMakanan.length; i++) {
                if (dataMenu[0].replace(" ", "").equals(menuMakanan[i].replace(" ", ""))) {
                    totalPesanan += hargaMenuMakanan[i] * jumlah;
                }
            }
            for (int i = 0; i < menuMinuman.length; i++) {
                if (dataMenu[0].replace(" ", "").equals(menuMinuman[i].replace(" ", ""))) {
                    totalPesanan += hargaMenuMinuman[i] * jumlah;
                }
            }
        }

        // Terapkan diskon dan penawaran serta biaya pelayanan

        int totalBiaya = totalPesanan;
        if (totalBiaya > 100000) {
            totalBiaya *= 0.9;
        }

        if (totalBiaya > 50000) {
            for (int i = 0; i < pesanan.length; i++) {
                if (pesanan[i].split(" ")[0].split(" ")[0].equals("Minuman")) {
                    totalBiaya -= hargaMenuMinuman[Integer.parseInt(pesanan[i].split(" ")[1]) - 1];
                    break;
                }
            }
        }

        totalBiaya += 20000;

        // Tampilkan struk pesanan
        System.out.println("Struk Pesanan");
        System.out.println("------------------");
        for (String menu : pesanan) {
            String[] dataMenu = menu.split("=");
            int jumlah = Integer.parseInt(dataMenu[1].replace(" ", ""));

            for (int i = 0; i < menuMakanan.length; i++) {
                if (dataMenu[0].replace(" ", "").equals(menuMakanan[i].replace(" ", ""))) {
                    System.out.println(dataMenu[0] + "(" + jumlah + ")" + hargaMenuMakanan[i] * jumlah);
                }
            }
            for (int i = 0; i < menuMinuman.length; i++) {
                if (dataMenu[0].replace(" ", "").equals(menuMinuman[i].replace(" ", ""))) {
                    System.out.println(dataMenu[0] + "(" + jumlah + ")" + hargaMenuMinuman[i] * jumlah);
                }
            }
        }
        System.out.println();
        System.out.println("Total Pesanan: " + totalPesanan);
        System.out.println("Pajak: " + (totalBiaya * 0.1));
        System.out.println("Biaya Pelayanan: " + 20000);
        if (totalBiaya > 100000) {
            System.out.println("Diskon: " + (totalBiaya * 0.1));
        } else if (totalBiaya > 50000) {
            System.out.println("Minuman Gratis: " + menuMinuman[(int) (Math.random() * 4)]);
        }
        System.out.println("Total Bayar: " + (totalBiaya + (totalBiaya * 0.1)));
    }
}