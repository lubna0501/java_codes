package Simple;

import java.io.*;

public class FileReadWriteDemo {

    // Method to write data to a file
    public static void writeToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "This is a sample text to demonstrate file writing and reading.";

        // Write to the file
        writeToFile(fileName, data);

        // Read from the file
        System.out.println("Reading from the file:");
        readFromFile(fileName);
    }
}

