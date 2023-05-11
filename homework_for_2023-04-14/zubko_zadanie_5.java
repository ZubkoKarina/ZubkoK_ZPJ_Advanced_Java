import java.util.stream.IntStream;

public class zubko_zadanie_5 {
    public static void main(String[] args) {
        String str = "Carpe diem, quam minimum credula postero";
        int step = 4;
        IntStream.iterate(0, i -> i + step)
                 .limit((str.length() + step - 1) / step)
                 .mapToObj(i -> str.substring(i, Math.min(i + step, str.length())))
                 .forEach(System.out::println);
    }
}
