public class Vehicle {
    public String brand;
    public String color;
    public String model;
    public float price;
    public int numberOfTyres;

    public void printVehicle(String brand, String color, String model, float price, int numberOfTyres) {
        System.out.println("Brand = " + brand + "\n Color = " + color + "\n Model = " + model + "\n Price =" + price
                + "\n Number of Tyres =" + numberOfTyres);
    }

    public Vehicle(String b, String c, String m, float p, int n) {
        System.out.println(" \n");
        brand = b;
        color = c;
        model = m;
        price = p;
        numberOfTyres = n;
        printVehicle(brand, color, model, price, numberOfTyres);
    }

    public Vehicle() {
        System.out.println("\n");
    }

    public static void main(String Arg[]) {
        Vehicle S = new Vehicle();
        S.printVehicle("Toyota", "Red", "Supra", 700000, 6);
        Vehicle Vehicle = new Vehicle("Maruti", "Yellow", "Alto", 800000, 4);
    }
}