import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Zad_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        Stream<ArrayList<Integer>> stream = Stream.of(list1, list2, list3);
        ArrayList<Integer> result1 = stream.reduce(new ArrayList<>(), (acc, list) -> {
            acc.addAll(list);
            return acc;
        });
        stream = Stream.of(list1, list2, list3);
        Optional<ArrayList<Integer>> result2Optional = stream.reduce((listA, listB) -> {
            ArrayList<Integer> combined = new ArrayList<>(listA);
            combined.addAll(listB);
            return combined;
        });
        ArrayList<Integer> result2 = result2Optional.orElse(new ArrayList<>());
        stream = Stream.of(list1, list2, list3);
        ArrayList<Integer> result3 = stream.reduce(new ArrayList<>(),
                (acc, list) -> {
                    ArrayList<Integer> newList = new ArrayList<>(acc);
                    newList.addAll(list);
                    return newList;
                },
                (listA, listB) -> {
                    ArrayList<Integer> combined = new ArrayList<>(listA);
                    combined.addAll(listB);
                    return combined;
                }
        );
        System.out.println("Результат 1: " + result1);
        System.out.println("Результат 2: " + result2);
        System.out.println("Результат 3: " + result3);
    }
}
