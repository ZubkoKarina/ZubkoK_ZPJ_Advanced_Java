import java.util.*;
import java.util.stream.*;

public class zubko_zadanie_10 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
        OptionalDouble average = stringList.stream()
                                    .mapToInt(String::length)
                                    .average();

        if (average.isPresent()) {
            System.out.println("string length :" + average.getAsDouble());
        } else {
            System.out.println("mpty.");
        }
    }
}
