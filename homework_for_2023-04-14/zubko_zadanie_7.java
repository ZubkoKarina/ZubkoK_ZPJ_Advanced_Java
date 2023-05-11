import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class zubko_zadanie_7 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("example.txt"); // Example file: "example.txt"
        
        Stream<String> lines = Files.lines(path);
        lines.flatMap(line -> Arrays.stream(line.split("\\W+")))
             .filter(zubko_zadanie_7::isAlphabetic)
             .limit(100)
             .forEach(System.out::println);

        lines = Files.lines(path);
        Map<String, Long> wordCounts = lines.flatMap(line -> Arrays.stream(line.split("\\W+")))
                                            .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        
        wordCounts.entrySet().stream()
                  .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                  .limit(10)
                  .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
    
    private static boolean isAlphabetic(String str) {
        return str.codePoints().allMatch(Character::isAlphabetic);
    }
}
