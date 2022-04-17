enum Level {
    LOW,
    MEDIUM,
    HIGH,
}

public class Switch_Enum {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
            System.out.println("Low level");
            break;
            case MEDIUM:
            System.out.println("MEDIUM level");
            break;
            case HIGH:
            System.out.println("Low level");
            break;
            
        }
    }
}
