import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) {
        String textToWrite = "Hello everyone, I am Omkar Abhishek Jha and I am studying in IT Department";

        try {
            // Specify the file path
            String filePath = "myFile1.txt";

            PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));

            printWriter.println(textToWrite);

            printWriter.close();

            System.out.println("Text has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: ");
        }
    }
}
