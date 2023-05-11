import java.util.*;
import java.util.stream.*;

public class zubko_zadanie_11 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five", "longeststring");
        int maxLength = stringList.stream()
                            .mapToInt(String::length)
                            .max()
                            .orElse(-1);
        List<String> longestStrings = stringList.stream()
                                        .filter(s -> s.length() == maxLength)
                                        .collect(Collectors.toList());
        System.out.println("longest string: " + longestStrings);
    }
}
