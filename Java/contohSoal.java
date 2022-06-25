public class contohSoal {
    public static void main(String[] args) {
        String kalimat = "Saya Adalah Mahasiswa Universitas Terbuka";
        String ubah;
        System.out.println("kalimat sebelum :" + kalimat);
        ubah = kalimat.replace('a', 'A');
        System.out.println("kalimat setelah :" + ubah);

        // Menampilkan Jumlah Karakter pada Variabel Kalimat
        int panjangKalimat = ubah.length();
        System.out.println("Jumlah karakter pada kalimat adalah " + panjangKalimat + " Huruf");

        // Menampilkan keterangan "Genap" jika jumlah kata genap
        // ataupun "Ganjil" jika jumlah kata Ganjil
        if (panjangKalimat % 2 == 1) {
            System.out.println("Kalimat ini mempunyai karakter ganjil");
        } else {
            System.out.println("Kalimat ini mempunyai karakter genap");
        }
    }
}