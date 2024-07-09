import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalysis {
    public static void main(String[] args) {
        String filePath = "file.txt";

        int charCount = 0;
        int wordCount = 0;
        int spaceCount = 0;
        int letterCount = 0;
        int digitCount = 0;

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                charCount = line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c))
                        letterCount++;
                    else if (Character.isDigit(c))
                        digitCount++;
                    else if (Character.isWhitespace(c))
                        spaceCount++;
                }
            }
            scanner.close();
            System.out.println("Character Count: " + charCount);
            System.out.println("Word Count: " + wordCount);
            System.out.println("Space Count: " + spaceCount);
            System.out.println("Letter Count: " + letterCount);
            System.out.println("Digit Count: " + digitCount);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }

    }

}
