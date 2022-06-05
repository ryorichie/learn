public class methodTepat{
    public static void main(String[] args) {
        String stringAwal = "Ini adalah artikel tentang bahasa pemrograman komputer";

        System.out.println(stringAwal.substring(0, 45) + " Java");
        System.out.println(stringAwal.substring(27, 45) + " Java");
        System.out.println((stringAwal.substring(27, 45)).toUpperCase() + " Java");
        System.out.println((stringAwal.substring(46, 54)).toUpperCase());
        System.out.println((stringAwal.substring(0, 3)).toLowerCase());
    }
}