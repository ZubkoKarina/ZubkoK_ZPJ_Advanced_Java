import java.util.Arrays;
import java.util.stream.Stream;

public class zubko_zadanie_18 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 2, 3, 4, 4, 5, 5, 5, 6);

        int[] lastElement = {Integer.MIN_VALUE};
        stream.filter(e -> {
            boolean isDuplicate = e.equals(lastElement[0]);
            lastElement[0] = e;
            return !isDuplicate;
        }).forEach(System.out::println);
    }
}

