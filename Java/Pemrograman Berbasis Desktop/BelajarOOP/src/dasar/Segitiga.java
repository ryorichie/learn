/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Segitiga extends Matematika{
    private float base;
    private float height;
    public Segitiga(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    float luas() {
        return (float) 0.5 * base * height;
    }
}
