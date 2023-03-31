import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        Stream<int[]> wrongStream = Stream.of(values); 
        System.out.println("wrong stream: " + Arrays.toString(wrongStream.toArray()));
        IntStream intStream = Arrays.stream(values); 
        System.out.println("correct stream: " + Arrays.toString(intStream.toArray()));
    }
}

