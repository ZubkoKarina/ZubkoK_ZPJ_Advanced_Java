import java.math.BigInteger;
//zadanie 6
interface Sequence<T> {
    boolean hasNext();
    T next();
}
class SquareSequence implements Sequence<BigInteger> {
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
public class Main {
    public static void main(String[] args) {
        Sequence<BigInteger> squareSequence = new SquareSequence();
        for (int i = 0; i < 10; i++) {
            System.out.println(squareSequence.next());
        }
    }
}
