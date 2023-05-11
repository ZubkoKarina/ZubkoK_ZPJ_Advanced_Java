
public class zubko_zadanie9{
    public static class Greeter implements Runnable {
        private int n;
        private String target;
        public Greeter(int n, String target) {
            this.n = n;
            this.target = target;
        }
        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.println("Witaj, " + target);
            }
        }
    }
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(5, "Karina");
        Greeter greeter2 = new Greeter(5, "Tim");
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);
        thread1.start();
        thread2.start();
    }
}