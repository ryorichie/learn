/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class ifelse {

    public static void main(String[] args) {
        boolean Hujan = true;
        String cuaca = "panas";
        int angka = 23;

        // if else
        if (Hujan = true) {
            System.out.println("bawa payung");
        } else {
            System.out.println("jalan kaki");
        }

        // if else if case ver
        switch (cuaca) {
            case "hujan":
                System.out.println("pakai payung");
            case "mendung":
                System.out.println("jalan aja");
            case "panas":
                System.out.println("pakai sunscreen");
            default:
        }

        int grade = 90;

        switch (grade) {
            case 100:
                System.out.println("Excellent");
                break; // neccesay in int result
            case 90:
                System.out.println("Good");
                break;
            case 80:
                System.out.println("Average");
                break;
        }

        // if else if
        if (cuaca == "hujan") {
            System.out.println("pakai payung");
        } else if ("mendung".equals(cuaca)) {
            System.out.println("jalan aja");
        } else if ("panas".equals(cuaca)) {
            System.out.println("pakai sunscreen");
        }

        // nested if
        // can't do it with shorthand
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah Bilangan genap");
            if (angka > 10) {
                System.out.println("Bilangan lebih besar dari 10");
            } else {
                System.out.println("Angka lebih kecil dari 10");
            }
        } else {
            System.out.println(angka + " adalah Bilangan ganjil");
            if (angka > 10) {
                System.out.println("Bilangan lebih besar dari 10");
            } else {
                System.out.println("Angka lebih kecil dari 10");
            }
        }
    }
}
