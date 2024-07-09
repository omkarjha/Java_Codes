public class Shape {
    String name;
    int dimension;
    int noofsides;

    public void printShape(String name, int dimension, int noofsides) {
        System.out.println("Name = " + name + "Dimension = " + dimension + "noofsides = " + noofsides);
    }

    public Shape(String n, int d, int s) {
        System.out.println("Initialising a Constructor.");
        name = n;
        dimension = d;
        noofsides = s;
        printShape(name, dimension, noofsides);

    }

    public Shape() {
        System.out.println("\n");
    }

    public static void main(String Arg[]) {
        Shape S = new Shape();
        S.printShape("Circle", 80, 0);
        Shape Vehicle2 = new Shape("Square", 30, 4);
    }
}