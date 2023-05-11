import java.util.stream.Stream;

public class zubko_zadanie_4 {
    public static void main(String[] args) {
        Stream<Long> stream = generateLCG(25214903917L, 11L, (long) Math.pow(2, 48), 0L).limit(10);
        stream.forEach(System.out::println);
    }
    public static Stream<Long> generateLCG(long a, long c, long m, long seed) {
        return Stream.iterate(seed, xn -> (a * xn + c) % m);
    }
}
