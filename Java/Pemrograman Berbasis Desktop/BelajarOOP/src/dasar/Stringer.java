/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Stringer {

    // Declaring string
    public static void main(String[] args) {
        // Declaring variable
        byte data[] = {21,22,23,33,23,12,41,14};
        // Declaring string array
        String[] nama_orang;
        String nama_serangga[];
        String[] nama_hewan = new String[4];
        String s1 = "ohayou";
        String s2 = new String("Aloha");
        String s3 = new String(data);
        String s4 = new String(data, 2, 2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
