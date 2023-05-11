import java.util.Arrays;

public class zubko_zadanie10 {
    public static void runTogether(Runnable... tasks) {
        Arrays.stream(tasks).forEach(task -> new Thread(task).start());
    }
    public static void runInOrder(Runnable... tasks) {
        Arrays.stream(tasks).forEach(Runnable::run);
    }
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("task 1");
        Runnable task2 = () -> System.out.println("task 2");
        Runnable task3 = () -> System.out.println("task 3");
        System.out.println("running together:");
        runTogether(task1, task2, task3);
        System.out.println("running in order:");
        runInOrder(task1, task2, task3);
    }
}
