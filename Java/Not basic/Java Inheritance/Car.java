class Vehicle { // you can add final to lock the classes
    protected String brand = "Ford"; // Vehicle attribut

    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribut

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the vehicle class) on the myCard object
        myCar.honk();

        // Display the value of the brand attribut (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}