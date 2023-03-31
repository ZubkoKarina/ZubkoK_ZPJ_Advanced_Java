import java.util.stream.Stream;

public class LCG {
    public static void main(String[] args) {
        Stream<Long> randomNumbers = lcg(2556543433917L, 11L, (long) Math.pow(2, 48), 0L);
        randomNumbers.limit(10).forEach(System.out::println);
    }
    public static Stream<Long> lcg(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}

