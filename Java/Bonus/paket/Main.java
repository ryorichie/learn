import paketSepeda.*;

public class Main {
    public static String jenisSepedanya = "kakek";
    public static void main(String[] args) {
        System.out.println("Jenis Sepeda");
        System.out.println("-----------------------");
        SepedaGunung sepeda1 = new SepedaGunung();
        sepeda1.sepedaGunung();
        SepedaSantai sepeda2 = new SepedaSantai();
        sepeda2.sepedaSantai();
        System.out.println(jenisSepedanya);
    }
    
}
