import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = readInt(scanner);
        System.out.print("Enter second number: ");
        int num2 = readInt(scanner);

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2, hcf);

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculateLCM(int num1, int num2, int hcf) {
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
