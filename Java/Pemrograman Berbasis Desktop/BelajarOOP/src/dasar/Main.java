/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Main {

    public static void main(String[] args) {
        /// Segitiga
        // membuat objek dari class Segitiga
        Matematika Segitiga = new Segitiga(4, 5);
        // membuat objek dari class PersegiPanjang
        Matematika PersegiPanjang = new PersegiPanjang(2, 12);
        // menampikan output luas segitiga dan persegi panjang
        System.out.println("Luas Segitiga: " + Segitiga.luas());
        System.out.println("Luas Persegi Panjang " + PersegiPanjang.luas());

    }
}
