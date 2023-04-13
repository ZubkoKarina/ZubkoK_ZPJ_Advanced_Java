import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task11 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("short", "medium", "longest", "long");

        OptionalInt maxLength = stringStream.mapToInt(String::length).max();
        stringStream = Stream.of("short", "medium", "longest", "long"); 

        List<String> longestStrings = stringStream.filter(s -> s.length() == maxLength.getAsInt()).collect(Collectors.toList());

        longestStrings.forEach(System.out::println);
    }
}

