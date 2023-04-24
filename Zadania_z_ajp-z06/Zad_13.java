import java.util.*;
import java.util.stream.*;

public class Zad_13 {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5);
        Stream<Integer> second = Stream.of(2, 4, 6, 8, 10);
        zip(first, second).forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> builder = Stream.builder();
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();
        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext()) {
                builder.add(it1.next());
            } else {
                builder.add(null);
            }
            if (it2.hasNext()) {
                builder.add(it2.next());
            } else {
                builder.add(null);
            }
        }
        return builder.build();
    }
}
