import java.util.NoSuchElementException;
//zadanie 4
interface IntSequence {
    boolean hasNext();
    int next();
    static IntSequence of(int... values) {
        return new IntSequence() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < values.length;
            }
            @Override
            public int next() {
                if (hasNext()) {
                    return values[currentIndex++];
                }
                throw new NoSuchElementException("No more elements");
            }
        };
    }
    //zadanie 5
    static IntSequence constant(int constantValue) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public int next() {
                return constantValue;
            }
        };
    }
}
public class Main {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.print(sequence.next() + " ");
        }
        System.out.println();
        IntSequence constantSequence = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            System.out.print(constantSequence.next() + " ");
        }
    }
}