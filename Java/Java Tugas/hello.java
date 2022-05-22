import java.util.ArrayList;
import java.util.List;

class hello {
    public static void main(String[] args) {
        List Q = new ArrayList();
        Q.add("1");
        Q.add("2");
        Q.add("3");
        Q.add("4");
        System.out.println("List Java");
        for (Object queueList : Q) {
            System.out.println(queueList + "->");
        }
        // Replacing element
        System.out.println("\n New List Java");
        Q.set(0, "2");
        Q.set(1, "4");
        Q.set(2, "8");
        Q.set(3, "9");
        for (Object queueList : Q) {
            System.out.print(queueList);
            if (queueList != "9") {
                System.out.print("->");
            }
        }

    }
}