// Enum is special "class" that represents a group of constants variable

enum Level {
    LOW,
    MEDIUM,
    HIGH,
}

public class Main {
    static Level myVar = Level.HIGH;
    public static void main (String[] args) {
        System.out.println(myVar);
    }
}