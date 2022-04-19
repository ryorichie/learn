enum Level {
    HIGH,
    MEDIUM,
    LOW,
}

public class Enum_Loop {
    public static void main(String[] args) {
        for(Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}