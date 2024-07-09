import java.io.*;
import java.util.*;

public class FileCopyWithSorting {
    public static void main(String[] args) {
        try {
            // Specify the input file and output file names
            String inputFile = "myFile.txt";
            String outputFile = "myFileCopy.txt";

            // Create a Scanner to read the input file
            Scanner scanner = new Scanner(new File(inputFile));

            // Create a PrintWriter to write to the output file
            PrintWriter writer = new PrintWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into words
                String[] words = line.split(" ");

                // Initialize a StringBuilder to store the modified line
                StringBuilder modifiedLine = new StringBuilder();

                for (String word : words) {
                    // Sort the letters of the word in ascending order
                    String sortedWord = sortLettersAscending(word);

                    // Append the sorted word to the modified line
                    modifiedLine.append(sortedWord).append(" ");
                }

                // Write the modified line to the output file
                writer.println(modifiedLine.toString().trim());
            }

            // Close the Scanner and PrintWriter
            scanner.close();
            writer.close();

            System.out.println("File copied and modified successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to sort the letters of a word in ascending order
    public static String sortLettersAscending(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
