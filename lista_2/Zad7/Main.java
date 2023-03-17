import java.util.Iterator;
//zadanie 7
class DigitSequence implements Iterator<Integer> {
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
        int result = number % 10;
        number /= 10;
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Iterator<Integer> digitSequence = new DigitSequence(12345);
        while (digitSequence.hasNext()) {
            System.out.print(digitSequence.next() + " ");
        }
    }
}

/*
 * 
 *  Jeśli przejdziesz na Javę 8, Twój kod nadal będzie się kompilować, ponieważ 
 *  interfejs Iterator w Javie 8 ma domyślne implementacje dla nowych metod, 
 *  takich jak forEachRemaining. Metody domyślne dostarczają domyślną 
 *  implementację, więc klasy implementujące interfejs nie muszą implementować 
 *  tych metod, chyba że chcą zastąpić domyślne zachowanie.
 *
 *  Jeśli umieścisz klasę Java 7 w JAR i nie będziesz jej rekompilować, będzie 
 *  ona działać w Javie 8, ponieważ Java 8 jest wstecznie kompatybilna z Javą 7.
 *
 *  Jeśli wywołasz metodę forEachRemaining, zostanie użyta domyślna implementacja, 
 *  ponieważ klasa DigitSequence nie dostarcza implementacji dla tej metody.    
 *
 *  W Javie 8 metoda remove staje się metodą domyślną, która zgłasza wyjątek 
 *  UnsupportedOperationException. Ponieważ klasa DigitSequence dostarcza własnej 
 *  implementacji metody remove, ta implementacja będzie używana. W tym przypadku 
 *  nie robi nic, więc wywołanie remove na instancji klasy DigitSequence nie będzie 
 *  miało żadnego wpływu.
 * 
 */