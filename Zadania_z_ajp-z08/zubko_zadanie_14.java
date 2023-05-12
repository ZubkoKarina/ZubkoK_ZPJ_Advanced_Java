import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class zubko_zadanie_14 {
    public static void main(String[] args) {
        Stream<ArrayList<Integer>> stream = Stream.of(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6)),
                new ArrayList<>(Arrays.asList(7, 8, 9))
        );
        ArrayList<Integer> result = stream.reduce(new ArrayList<>(), (a, b) -> {
            a.addAll(b);
            return a;
        });
        System.out.println(result);
    }
}
