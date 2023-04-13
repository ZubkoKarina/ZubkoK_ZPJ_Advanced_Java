import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) throws Exception {
        List<String> words = Files.readAllLines(Paths.get("words"));
        Set<String> vowels = Set.of("a", "e","i", "o", "u");

        List<String> wordsWithFiveVowels = words.stream()
            .filter(word -> word.toLowerCase().chars()
                .filter(Character::isAlphabetic)
                .mapToObj(c -> String.valueOf((char) c))
                .filter(vowels::contains)
                .distinct()
                .count() == 5)
            .collect(Collectors.toList());

        wordsWithFiveVowels.forEach(System.out::println);
    }
}


