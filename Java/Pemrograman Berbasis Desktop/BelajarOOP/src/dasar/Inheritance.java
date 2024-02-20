/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Inheritance {
    public class Pegawai {
        public String nama;
        public double gaji;
    }
    
    public class Manajer extends Pegawai {
        public String departemen;
    }
    
    public void IsiData(String n, String d) {
        String nama = n;
        String departemen = d;
    }
}
