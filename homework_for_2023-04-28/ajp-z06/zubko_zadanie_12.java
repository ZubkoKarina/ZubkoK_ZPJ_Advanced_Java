
import java.util.stream.Stream;

public class zubko_zadanie_12 {
    public static void main(String[] args) {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3, 4, 5, 4, 6, 24);
        System.out.println(zubko_zadanie_12(finiteStream)); 
    }
    public static <T> boolean zubko_zadanie_12(Stream<T> stream) {
        return stream.spliterator().estimateSize() != Long.MAX_VALUE;
    }
}
