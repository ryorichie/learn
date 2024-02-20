/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

import java.util.Arrays;

/**
 *
 * @author ryori
 */
public class Arraymethod {

    class Senjata {

        String nama;
        int jumlahPeluru;

        // method
        void tembak() {
            // ...
            // setelah nembak, kurangi peluru
            jumlahPeluru--;
        }

        void reload() {
            //..
            //jika direload maka jumlah peluru diisi ulang
            jumlahPeluru = 300;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {12, 10, 5, 8, 20, 11};
        int[] test2 = {12, 10, 5, 8, 20, 11};
        System.out.println("NilaiAwal array test1");

        for (int i = 0; i < 6; i++) {
            System.out.println("test1[" + i + "] = " + test1[i]);
            System.out.println("\n1. Method Equals\n Mengecek test1 dan test2 sama atau tidak");
            boolean sama = Arrays.equals(test1, test2);
            if (sama = true) {
                System.out.println("Array test1 sama dengan test2");
            }else {
                System.out.println("Array test 1 tidak sama dengan test2");
            }

            System.out.println("\n2. Method Sort\nArray test1 Setelah Sorting");;
            Arrays.sort(test1);
            for (int j = 0; j < 6; j++){
            System.out.println("Test1 [" + j + "] = " + test1[j]);
            }
            
            System.out.println("\n3. Method binary Search\nMencari letah salah satu nilai dalam array test 1, misalkan nilai");
            int hasilPencarian = Arrays.binarySearch(test1, 5);
            System.out.println("Angka 5 terdapat pada index" + hasilPencarian + 1);
            
            System.out.println("\n4. Method fill\nNilai array test 2 Setelah digantikan dengan 10");
            Arrays.fill(test2, 10);
            for (int k = 0; k < 6; k++) {
                System.out.println("Test2[" + k + "] = " + test2[k]);;
            }
            

        }
    }
}
