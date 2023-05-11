import java.util.Arrays;

public class zubko_zadanie_14 {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[] {
            () -> System.out.println("Runnable 1"),
            () -> System.out.println("Runnable 2"),
            () -> System.out.println("Runnable 3")
        };
        Runnable combinedRunnable = combine(runnables);
        combinedRunnable.run();
    }
    public static Runnable combine(Runnable[] runnables) {
        return () -> Arrays.stream(runnables).forEach(Runnable::run);
    }
}
