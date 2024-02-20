/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class PhoneUser {
    private Phone phone;
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    
    void turnOnThePhone() {
        this.phone.powerOn();
    }
    void turnOffThePhone() {
        this.phone.powerOff();
    }
    void makePhoneLouder() {
        this.phone.volumeUp();
    }
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
