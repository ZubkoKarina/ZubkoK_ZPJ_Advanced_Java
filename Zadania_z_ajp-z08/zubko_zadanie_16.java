import java.math.BigInteger;
import java.util.stream.Stream;

public class zubko_zadanie_16 {
    public static void main(String[] args) {
        BigInteger start = BigInteger.TEN.pow(49);
        Stream<BigInteger> primes = Stream.iterate(start, BigInteger::nextProbablePrime).parallel().limit(500);
        primes.forEach(System.out::println);
    }
}
