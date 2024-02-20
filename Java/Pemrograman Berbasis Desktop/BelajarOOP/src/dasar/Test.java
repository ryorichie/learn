/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Test {

    public static void main(String[] args) {
        // membuat array dengan 4 isi
        Manusia[] manusia = new Manusia[4];

        // membuat object
        manusia[0] = new Siswa();
        manusia[1] = new Karyawan();
        manusia[2] = new Programmer();
        manusia[3] = new Professor();

        for (int i = 0; i < manusia.length; i++) {
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();
        }
    }
}
