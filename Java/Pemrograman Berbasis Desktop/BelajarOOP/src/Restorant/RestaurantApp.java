import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class for menu items
abstract class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Abstract method to display menu item information
    public abstract void displayMenu();

    // Getters and setters for encapsulation
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

// Subclass for Food items
class Food extends MenuItem {
    private String foodType;

    public Food(String name, double price, String foodType) {
        super(name, price, "Food");
        this.foodType = foodType;
    }

    @Override
    public void displayMenu() {
        System.out.println(getName() + " (" + getCategory() + " - " + foodType + ") - $" + getPrice());
    }
}

// Subclass for Drink items
class Drink extends MenuItem {
    private String drinkType;

    public Drink(String name, double price, String drinkType) {
        super(name, price, "Drink");
        this.drinkType = drinkType;
    }

    @Override
    public void displayMenu() {
        System.out.println(getName() + " (" + getCategory() + " - " + drinkType + ") - $" + getPrice());
    }
}

// Subclass for Discount items
class Discount extends MenuItem {
    private double discountRate;

    public Discount(String name, double price, double discountRate) {
        super(name, price, "Discount");
        this.discountRate = discountRate;
    }

    @Override
    public void displayMenu() {
        System.out.println(getName() + " (" + getCategory() + ") - " + discountRate + "% off - $" + getPrice());
    }
}

// Class for managing the menu
class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    // Add new menu item to the menu
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // Display all items in the menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem menuItem : menuItems) {
            menuItem.displayMenu();
        }
        System.out.println();
    }

    // Save menu to a text file
    public void saveMenuToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (MenuItem menuItem : menuItems) {
                writer.println(menuItem.getName() + "," + menuItem.getPrice() + "," + menuItem.getCategory());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not save menu to file.");
        }
    }

    // Load menu from a text file
    public void loadMenuFromFile(String fileName) {
        menuItems.clear();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length == 3) {
                    String name = data[0];
                    double price = Double.parseDouble(data[1]);
                    String category = data[2];
                    MenuItem menuItem;

                    if (category.equals("Food")) {
                        menuItem = new Food(name, price, "Unknown");
                    } else if (category.equals("Drink")) {
                        menuItem = new Drink(name, price, "Unknown");
                    } else {
                        menuItem = new Discount(name, price, 0);
                    }

                    addMenuItem(menuItem);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not load menu from file.");
        }
    }

    // Getters for encapsulation
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

// Class for managing customer orders
class Order {
    private List<MenuItem> orderedItems;

    public Order() {
        this.orderedItems = new ArrayList<>();
    }

    // Add an item to the order
    public void addItemToOrder(MenuItem menuItem) {
        orderedItems.add(menuItem);
    }

    // Calculate the total cost of the order
    public double calculateTotal() {
        double total = 0;
        for (MenuItem menuItem : orderedItems) {
            total += menuItem.getPrice();
        }
        return total;
    }

    // Display the order
    public void displayOrder() {
        System.out.println("Order:");
        for (MenuItem menuItem : orderedItems) {
            menuItem.displayMenu();
        }
        System.out.println("Total: $" + calculateTotal());
    }

    // Save order to a text file
    public void saveOrderToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (MenuItem menuItem : orderedItems) {
                writer.println(menuItem.getName() + "," + menuItem.getPrice() + "," + menuItem.getCategory());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not save order to file.");
        }
    }

    // Load order from a text file
    public void loadOrderFromFile(String fileName, Menu menu) {
        orderedItems.clear();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length == 3) {
                    String name = data[0];
                    double price = Double.parseDouble(data[1]);
                    String category = data[2];
                    MenuItem menuItem = findMenuItemByName(name, menu);

                    if (menuItem != null) {
                        addItemToOrder(menuItem);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not load order from file.");
        }
    }

    // Helper method to find a menu item by name
    private MenuItem findMenuItemByName(String itemName, Menu menu) {
        for (MenuItem menuItem : menu.getMenuItems()) {
            if (menuItem.getName().equalsIgnoreCase(itemName)) {
                return menuItem;
            }
        }
        return null;
    }
}

// Main class for the restaurant application
public class RestaurantApp {
    // ... (existing code)

    public static void main(String[] args) {
        // ... (existing code)

        // Create instances of Menu and Order
        Menu restaurantMenu = new Menu();
        Order customerOrder = new Order();

        // Load menu from a file (if available)
        restaurantMenu.loadMenuFromFile("menu.txt");

        // Display the main menu
        restaurantMenu.displayMenu();

        // Accept customer orders
        System.out.println("Enter your order (type 'done' when finished):");
        String customerInput;
        while (!(customerInput = input.nextLine()).equalsIgnoreCase("done")) {
            try {
                MenuItem selectedMenuItem = findMenuItemByName(customerInput, restaurantMenu);
                if (selectedMenuItem != null) {
                    customerOrder.addItemToOrder(selectedMenuItem);
                } else {
                    System.out.println("Error: Item not found in the menu.");
                }
            } catch (MenuItemNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Display the customer's order
        customerOrder.displayOrder();

        // Save the order to a file
        customerOrder.saveOrderToFile("order.txt");

        // Save the updated menu to a file
        restaurantMenu.saveMenuToFile("menu.txt");
    }

    // Helper method to find a menu item by name
    private static MenuItem findMenuItemByName(String itemName, Menu menu) throws MenuItemNotFoundException {
        for (MenuItem menuItem : menu.getMenuItems()) {
            if (menuItem.getName().equalsIgnoreCase(itemName)) {
                return menuItem;
            }
        }
        throw new MenuItemNotFoundException("Item not found: " + itemName);
    }
}

// Custom exception for handling menu item not found
class MenuItemNotFoundException extends Exception {
    public MenuItemNotFoundException(String message) {
        super(message);
    }
}
