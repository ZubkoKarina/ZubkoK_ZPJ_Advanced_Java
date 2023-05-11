import java.util.Iterator;
import java.util.NoSuchElementException;

public class zubko_zadanie7{
    public static class DigitSequence implements Iterator<Integer> {
        private int number;
        public DigitSequence(int number) {
            this.number = number;
        }
        @Override
        public boolean hasNext() {
            return number != 0;
        }
        @Override
        public Integer next() {
            if (number == 0) {
                throw new NoSuchElementException();
            }
            int result = number % 10;
            number /= 10;
            return result;
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        DigitSequence digits = new DigitSequence(1234567890);
        while (digits.hasNext()) {
            System.out.print(digits.next());
        }
    }
}
