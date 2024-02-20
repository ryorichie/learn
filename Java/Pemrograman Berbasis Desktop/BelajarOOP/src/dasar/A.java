/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class A {

    public static void main(String[] args) {
        try {
//            int a = 1 / 0;
//            System.out.println("Perintah selanjutnya");
//            throw new Exception("Kesalahan buat buat");
//            throw new B();
        } catch (Exception kesalahan) {
            System.err.println(kesalahan);
        } finally {
            System.out.println("Perintah ini pasti jalan");
        }
    }

    static class B extends Exception {

        B() {
        } public String toString() {
            return "object dengan tipe kelas B";
        }

    }
    
    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {
//        throw new NullPointerException();
        throw new ArrayIndexOutOfBoundsException();
    }
}
