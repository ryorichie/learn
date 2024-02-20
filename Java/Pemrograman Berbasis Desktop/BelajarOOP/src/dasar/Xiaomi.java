/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ryori
 */
public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("HPmu Nyala");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("HP");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Penuh");
            } else {
                this.volume += 10;
                System.out.println("Voluem Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("HP Belum nyala");
        }
    }
       public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume 0");
            } else {
                this.volume -= 10;
                System.out.println("Voluem Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("HP Belum nyala");
        }
    }
 
    public int getVolume() {
        return this.volume;
    }
}
