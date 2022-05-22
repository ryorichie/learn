import java.util.Scanner;

public class nilaiSkorAkhir {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        float kontribusiNilaiKehadiran = 0.15f;
        float kontribusiNilaiUts = 0.20f;
        float kontribusiNilaiTugas = 0.15f;
        float kontribusiNilaiUas = 0.50f;
        float kontribusiNilaiTugas1 = kontribusiNilaiTugas * 0.25f;
        float kontribusiNilaiTugas2 = kontribusiNilaiTugas * 0.35f;
        float kontribusiNilaiTugas3 = kontribusiNilaiTugas * 0.40f;

        System.out.println("Masukkan Matakuliah Anda");
        String mataKuliah = myObj.next();
        System.out.println("Masukkan Nilai Kehadiran Anda");
        float nilaiKehadiran = (myObj.nextInt() * kontribusiNilaiKehadiran);
        System.out.println("Masukkan Nilai UTS Anda");
        float nilaiUts = (myObj.nextInt() * kontribusiNilaiUts);
        System.out.println("Masukkan Nilai Tugas1 Anda");
        float nilaiTugas1 = (myObj.nextInt() * kontribusiNilaiTugas1);
        System.out.println("Masukkan Nilai Tugas2 Anda");
        float nilaiTugas2 = (myObj.nextInt() * kontribusiNilaiTugas2);
        System.out.println("Masukkan Nilai Tugas3 Anda");
        float nilaiTugas3 = (myObj.nextInt() * kontribusiNilaiTugas3);
        float nilaiTugas = (nilaiTugas1 + nilaiTugas2 + nilaiTugas3);
        System.out.println("Masukkan Nilai UAS Anda");
        float nilaiUas = (myObj.nextInt() * kontribusiNilaiUas);
        float nilaiAkhir = (nilaiKehadiran + nilaiTugas + nilaiUts + nilaiUas);

        System.out.println("Nilai akhir matakuliah " + mataKuliah + " anda adalah : " + nilaiAkhir);

        char Grade;

        if (nilaiAkhir >= 85) {
            Grade = 'A';
        } else if (nilaiAkhir >= 70) {
            Grade = 'B';
        } else if (nilaiAkhir >= 60) {
            Grade = 'C';
        } else if (nilaiAkhir >= 50) {
            Grade = 'D';
        } else {
            Grade = 'E';
        }

        System.out.println("Dengan Peringkat " + Grade);
    }
}
