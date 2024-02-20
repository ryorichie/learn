/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Employee extends Person {

    public Employee(String ryo, int par, float par1) {
        super();
        System.out.println("Eksekusi konstruktor Employee");
    }

    public void info() {
        super.showMessage();
    }
    float salary = 4000f;
    String name = "ryo";
    int age = 20;

    public void showInfo() {
        System.out.println("Nama : " +this.name);
        System.out.println("Umur : " +this.age);
        System.out.println("Gaji : $ : " +salary);
    }
}
