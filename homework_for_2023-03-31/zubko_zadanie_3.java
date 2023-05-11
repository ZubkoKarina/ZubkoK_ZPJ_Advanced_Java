import java.util.Arrays;
import java.util.stream.IntStream;

public class zubko_zadanie_3 {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 32, 4, 1, 2, 43};
        IntStream stream = Arrays.stream(values);
        stream.forEach(System.out::println);
    }
}
