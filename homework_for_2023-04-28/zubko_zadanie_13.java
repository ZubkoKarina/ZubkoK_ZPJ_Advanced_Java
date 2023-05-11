import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public class zubko_zadanie_13 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        zip(stream1, stream2).forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> pierwszy, Stream<T> drugi) {
        Iterator<T> iterator1 = pierwszy.iterator();
        Iterator<T> iterator2 = drugi.iterator();
        Iterator<T> iterator = new Iterator<T>() {
            private boolean turn = true;
            @Override
            public boolean hasNext() {
                if (turn) {
                    return iterator1.hasNext();
                } else {
                    return iterator2.hasNext();
                }
            }
            @Override
            public T next() {
                if (turn) {
                    turn = false;
                    return iterator1.next();
                } else {
                    turn = true;
                    return iterator2.next();
                }
            }
        };
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }
}
