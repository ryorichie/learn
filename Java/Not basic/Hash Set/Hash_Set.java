import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Hosh");
        name.add("Josh");
        name.add("Bosh");
        name.add("Gosh");
        name.add("Mosh");
        name.add("Josh");
        System.out.println(name);

        // Check existance of item
        System.out.println(name.contains("Bosh"));;

        // Remove an Item
        name.remove("Josh");
        System.out.println(name);

        // Hash Set Size
        System.out.println(name.size());

        // Loop Through a HashSet
        for (String i : name) {
            System.out.println(i);
        }


        //Remove all itme
        name.clear();
    }
}
