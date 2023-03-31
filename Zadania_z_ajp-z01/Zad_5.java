//zad 5
public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence constant(int number) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return number;
            }
        };
    }
}
