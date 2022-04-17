// Import ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        // Make a collection
        ArrayList<String> name = new ArrayList<String>();
        name.add("Gosh");
        name.add("Josh");
        name.add("Hosh");
        name.add("Bosh");

        // Get the iterator
        Iterator<String> it = name.iterator();

        // Print the first item
        System.out.println(it.next());

        // Looping Through a Collection
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing items from a Collection
        ArrayList<Integer> Prime = new ArrayList<Integer>();
        Prime.add(2);
        Prime.add(3);
        Prime.add(5);
        Prime.add(7);
        Prime.add(11);
        Iterator<Integer> itPrime = Prime.iterator();
        while(itPrime.hasNext()) {
            Integer i = itPrime.next();
            if(i < 10) {
                itPrime.remove();
            }
        }

        System.out.println(Prime);
    }
}
