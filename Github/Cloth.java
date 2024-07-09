public class Cloth {
    String color;
    int size;
    String material;

    public void printClothType(String color, int size, String material) {
        System.out.println("Color = " + color + "\nSize = " + size + "m" + "\nMaterial = " + material);
    }

    public static void main(String args[]) {
        Cloth c = new Cloth();
        c.printClothType("Yellow", 2, "Silk");
    }
}
