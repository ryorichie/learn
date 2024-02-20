/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Circle extends Matematika{
    private float radius;
    public Circle(float radius) {
        this.radius = radius;
    }
    @Override
    float luas() {
        return(float) (Math.PI * radius * radius);
    }
}
