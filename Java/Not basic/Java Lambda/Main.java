import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
interface StringFunction{
    String run(String str);
}

    public static void main(String[] args) {
        ArrayList<Integer> prim = new ArrayList<Integer>();
        prim.add(2);
        prim.add(3);
        prim.add(5);
        prim.add(7);
        prim.add(11);
        prim.add(13);
        prim.add(17);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        prim.forEach(method);
    }
}

// lambda syntax
// (parameter1, parameter2) -> expression
