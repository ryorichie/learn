public class Data_type {
    public final int konstantapublik; // can' be declare later
    private final int konstantaprivate;
    public Data_type() {
        konstantapublik = 20;
        konstantaprivate = 30;
        // static variable can't be assign withou value

    }

    public static void main(String[] args) {
        int angka;
        char karakter = 'A';
        angka = 23; // possible
        long angka_besar = 30000001002L;
        float desimal = 3.2f;
        byte angka_kecil = 100;
        short angka_agak_kecil =  3100;
        boolean pernyataan = true;
        final int konstanta = 200; // can't be change

        System.out.println(karakter);
        System.out.println(angka);
        System.out.println(angka_besar);
        System.out.println(desimal);
        System.out.println(angka_kecil);
        System.out.println(angka_agak_kecil);
        System.out.println(pernyataan);
        System.out.println(konstanta);
        Data_type a = new Data_type();
        System.out.println(a.konstantapublik);
        System.out.println(a.konstantaprivate);

    }
}

