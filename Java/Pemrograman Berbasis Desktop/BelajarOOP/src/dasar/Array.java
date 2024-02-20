package dasar;
public class Array {

    public int[] myArray = new int[]{1, 2, 3, 4, 5};

    public static void main (String[] args){
        // Declaring array
        int[] bilangan_prima;
        // Initializing array
        bilangan_prima = new int[3];
        // Inputting data to array
        bilangan_prima[0] = 2;
        bilangan_prima[1] = 3;
        bilangan_prima[2] = 5;
        
        // shorter
        int[] prime_number = {2, 3, 5};
        System.out.println("Bilangan prima contohnya " + prime_number[0]);
    }
}