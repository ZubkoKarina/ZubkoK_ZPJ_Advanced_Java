import java.util.stream.*;

public class zubko_zadanie_12 {
    public static void main(String[] args) {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3);
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
        System.out.println(isFinite(finiteStream)); 
        System.out.println(isFinite(infiniteStream)); 
    }
    public static <T> boolean isFinite(Stream<T> stream) {
        try {
            long size = stream.spliterator().estimateSize();
            return size >= 0 && size != Long.MAX_VALUE;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }
}
