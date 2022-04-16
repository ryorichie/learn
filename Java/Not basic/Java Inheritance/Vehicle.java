class Vehicle {
    protected String brand = "Ford"; // Vehicle attribut

    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelname = "Mustang"; // Car attribut
    public static void main(String[] args) {
        
    }
}