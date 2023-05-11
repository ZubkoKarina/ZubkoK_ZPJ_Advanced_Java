import java.util.*;
import java.util.stream.*;

public class zubko_zadanie_13 {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5);
        Stream<Integer> second = Stream.of(2, 4, 6, 8, 10);
        zip(first, second).forEach(System.out::println);  
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Iterator<T> iterator = new Iterator<T>() {
            private boolean flip = false;
            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() || secondIterator.hasNext();
            }
            @Override
            public T next() {
                flip = !flip;
                if (flip && firstIterator.hasNext()) {
                    return firstIterator.next();
                } else if (!flip && secondIterator.hasNext()) {
                    return secondIterator.next();
                }
                return null;
            }
        };
        Iterable<T> iterable = () -> iterator;
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
