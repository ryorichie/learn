// Interface
interface Animal {
    public void animalSound(); // interface method

    public void sleep();
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound()is provided here
        System.out.println("The pg says: wee wee");
    }

    public void sleep() {
        // The body of sleep() provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}