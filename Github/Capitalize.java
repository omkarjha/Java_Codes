import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();

        String[] arrStrings = str.split("am");

        for (String a : arrStrings) {
            if (!a.isEmpty()) {
                String Capitalize = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
                System.out.print(Capitalize + " ");
            }
        }
        System.out.println(" ");
        sc.close();

    }
}
