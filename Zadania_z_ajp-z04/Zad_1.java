import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        Stream<String> planets = Stream.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");

        planets.peek(p -> System.out.println("filter called for: " + p))
                .filter(planet -> planet.length() > 5)
                .limit(5)
                .forEach(System.out::println);
    }
}

