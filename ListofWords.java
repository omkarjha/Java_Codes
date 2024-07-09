import java.util.*;

public class ListofWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter words (type 'exit' to finish):");

        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            words.add(word);
        }

        System.out.println("Words containing 'ade':");
        for (String word : words) {
            for (int i = 0; i <= word.length() - 3; i++) {
                if (word.substring(i, i + 3).equals("ade")) {
                    System.out.println(word);
                    break;
                }
            }
        }

        scanner.close();
    }

}
