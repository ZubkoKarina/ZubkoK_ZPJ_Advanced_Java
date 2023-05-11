import java.nio.file.*;
import java.util.Arrays;
import java.util.stream.*;

public class zubko_zadanie_9 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("./words.txt");
        Stream<String> lines = Files.lines(path);
        String[] result = lines.filter(zubko_zadanie_9::hasFiveUniqueVowels)
                               .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
    }
    private static boolean hasFiveUniqueVowels(String str) {
        return str.toLowerCase().chars()
                  .filter(c -> "aeiou".indexOf(Character.toChars(c)[0]) != -1)
                  .distinct()
                  .count() == 5;
    }
}
