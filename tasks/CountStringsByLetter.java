package tasks;
import java.util.List;

public class CountStringsByLetter {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "apricot", "banana", "avocado", "cherry");

        long count = words.stream().filter(word -> word.startsWith("a")).count();

        System.out.println("Count of words starting with 'a': " + count);
    }
}
