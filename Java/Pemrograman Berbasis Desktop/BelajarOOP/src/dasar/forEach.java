/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

import dasar.Array;

/**
 *
 * @author ryori
 */
public class forEach {

    public static void main(String[] args) {
        Array varick = new Array();
        for (int x : varick.myArray) {
            System.out.println(x + " ");
        }
        for (int y=10; y>=1; y--) { 
            System.out.println(y + "");
        }
    }
}
