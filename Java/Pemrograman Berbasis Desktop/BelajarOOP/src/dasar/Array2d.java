/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Array2d {

    public static void main(Stringer[] args) {
        int[][] array2d = new int[3][3];
        int[][] arraycepat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                array2d[i][j] = i * j;
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                System.out.println(array2d[i][j]);
            }
        }
        for (int i = 0; i < arraycepat.length; i++) {
            for (int j = 0; j < arraycepat.length; j++) {
                System.out.println(arraycepat[i][j]);
            }
        }
    }
}
