package tasks;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckIfNegativeNo {
    public static void readNumbersFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            int number = Integer.parseInt(line);
            if (number > 0) {
                throw new IllegalArgumentException("Found a positive number: " + number);
            }
        }
        System.out.println("No positive numbers found in the file.");
    }

    public static void main(String[] args) {
        try {
            readNumbersFromFile("C:/Users/varsh/eclipse-workspace/TechM/src/tasks/numbers.txt");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}