//Zad 6
import java.math.BigInteger;

public interface Sequence<T> {
    boolean hasNext();
    T next();
}

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger current = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        current = current.add(BigInteger.ONE);
        return current.multiply(current);
    }
}
