import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public Stream<String> codePoints(String input, int length) {
        return IntStream.iterate(0, i -> i + length)
                .limit(input.length() / length)
                .mapToObj(offset -> input.substring(offset, Math.min(offset + length, input.length())));
    }

    public static void main(String[] args) {
        Task5 task = new Task5();
        String input = "abcdefghijklm";
        task.codePoints(input, 3).forEach(System.out::println);
    }
}

