/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class javeMethod {
    // void method
    // add static for it to be access from main void withoud call object
    public static void cetakPesan() {
        System.out.println("void method");
    }
    public static void cetakTeks(String teks) {
        System.out.println(teks);
    }
    
    //
    public static String nama = "Ryo Richie";
    public static String getNama() {
        return nama;
    }
    
    public static int hitunganUmur(int sekarang, int tanggallahir) {
        int umur = sekarang - tanggallahir;
        return umur;
    }
    
    // return method
    public static int maxFunction(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        return max;
    }
    
    public static void main (String[] args) {
        cetakPesan();
        cetakTeks("Berhasil");
        
        // short way
        System.out.println(getNama());
        
        // longway
        String namaSaya = getNama();
        System.out.println(namaSaya);
        
        int umurSaya = hitunganUmur(2023, 2003);
        System.out.println(umurSaya);
        // or
        System.out.println(hitunganUmur(2023, 2003));
    }
}
