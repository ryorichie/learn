import java.util.HashMap; // Import the HashMap class
import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) {
        // create hashmap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Indonesia", "Jakarta");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Other Type Hash Map
        HashMap<String, Integer> peopleAge = new HashMap<String, Integer>();
        peopleAge.put("Josh", 20);
        peopleAge.put("Hosh", 20);
        peopleAge.put("Gosh", 20);
        System.out.println(peopleAge);

        // Access an Item
        System.out.println(capitalCities.get("Indonesia"));

        // Remove an item
        capitalCities.remove("USA");

        // Hashmap Size
        System.out.println(capitalCities.size());

        // Loop Through a Hashmap
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // Remove all item
        capitalCities.clear();
    }
}