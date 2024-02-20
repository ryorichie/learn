package dasar;
public class Game {
    public static void main (String[] args) {
        Player petani_labu = new Player();
        
        petani_labu.name = "Ryo Richie";
        petani_labu.speed = 2000;
        petani_labu.healthPoin = 0;
        
        petani_labu.run();
        
        if(petani_labu.isDead()) {
            System.out.println(("Game Over!"));
        }
    }
}
