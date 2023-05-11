
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class zubko_zadanie_14{
    public static void main(String[] args) {
        Stream<ArrayList<Integer>> stream = Stream.of(
            new ArrayList<>(Arrays.asList(1, 2, 3)),
            new ArrayList<>(Arrays.asList(4, 5, 6)),
            new ArrayList<>(Arrays.asList(7, 8, 9))
        );
        System.out.println(combine(stream));  
    }

    public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {
        return stream.reduce(new ArrayList<T>(), (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        });
    }
}
