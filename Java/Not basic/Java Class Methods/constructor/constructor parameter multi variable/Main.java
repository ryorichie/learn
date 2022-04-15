public class Main {
    public static void main(String[] args) {
        Main myCar = new Main(1969, "Ferrari");
        System.out.println("This car is from " + myCar.modelYear + " it's " + myCar.modelName);
    }

    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }
}
