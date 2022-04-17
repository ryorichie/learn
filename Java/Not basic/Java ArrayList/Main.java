import java.util.ArrayList; // import the arraylist class
import java.util.Collections; // Import the Collections class

public class Main {
    public static void main(String[] args) {
        // String array
        ArrayList<String> name = new ArrayList<String>();
        name.add("Josh");
        name.add("Johs");
        name.add("John");
        name.add("Hosh");
        name.add("Gosh");
        System.out.println(name.get(2));

        // Integer Array
        ArrayList<Integer> prem = new ArrayList<Integer>();
        prem.add(7);
        prem.add(3);
        prem.add(5);
        prem.add(2);
        prem.add(13);
        prem.add(11);
        System.out.println(prem);

        // Change an item
        name.set(2, "bosh");
        System.out.println(name.get(2));

        // Remove an Item
        name.remove(3);
        System.out.println(name.get(3));

        // ArrayList Size
        System.out.println(name.size());
        
        // Loop Through an Array List
        for (int i = 0; i < name.size(); i ++) {
            System.out.println(name.get(i));
        }

        // Loop Through an Array List (For each loop)
        for (String i : name) {
            System.out.println(i);
        }

        // Sort an ArrayList
        Collections.sort(prem); // sort prem
        System.out.println(prem);

        // remove all the element
        name.clear();
    }
}

// ArrayList class is a resizable arrya, which can be found in the java.util
/**
 * The difference between a built-in array and an ArrayList in Java, is that the
 * size of an array cannot be modified (if you want to add or remove elements
 * to/from an array, you have to create a new one). While elements can be added
 * and removed from an ArrayList whenever you want. The syntax is also slightly
 * different:
 */