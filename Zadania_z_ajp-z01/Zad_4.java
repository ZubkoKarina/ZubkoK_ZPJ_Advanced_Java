//zad 4 a
public class IntSequenceClass implements IntSequence {
    private int[] numbers;
    private int currentIndex = 0;

    private IntSequenceClass(int[] numbers) {
        this.numbers = numbers;
    }

    public static IntSequence of(int... numbers) {
        return new IntSequenceClass(numbers);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < numbers.length;
    }

    @Override
    public int next() {
        return numbers[currentIndex++];
    }
}

//zad 4 b
public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int... numbers) {
        return new IntSequence() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < numbers.length;
            }

            @Override
            public int next() {
                return numbers[currentIndex++];
            }
        };
    }
}

