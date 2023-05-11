import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class zubko_zadanie_16{
    public static void main(String[] args) {
        RandomSequence randomSequence = new RandomSequence();
        IntStream intStream = randomSequence.randomInts(0, 10);
        intStream.forEach(System.out::println);
    }
    static class RandomSequence implements IntSupplier {
        private Random generator = new Random();
        IntStream randomInts(int low, int high) {
            return IntStream.generate(() -> generator.nextInt(high - low) + low);
        }

        @Override
        public int getAsInt() {
            return generator.nextInt();
        }
    }
}
