package dasar;
public class Player {
    String name;
    int speed;
    int healthPoin;
    
    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }
    
    boolean isDead() {
        if(healthPoin <= 0) return true;
        return false;
    }
}
