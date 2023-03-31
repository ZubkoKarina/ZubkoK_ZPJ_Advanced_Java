import java.util.Arrays;

public class SequentialRunnable {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[] {
            () -> System.out.println("Task 1"),
            () -> System.out.println("Task 2"),
            () -> System.out.println("Task 3")
        };
        
        Runnable combined = runInSequence(runnables);
        combined.run();
    }

    public static Runnable runInSequence(Runnable... tasks) {
        return () -> Arrays.stream(tasks).forEach(Runnable::run);
    }
}

