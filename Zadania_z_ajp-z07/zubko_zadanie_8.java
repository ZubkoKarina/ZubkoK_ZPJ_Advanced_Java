import java.util.*;
import java.util.stream.*;

class Pet {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Person {
    private String city;
    private Optional<Pet> pet;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Optional<Pet> getPet() {
        return pet;
    }
    public void setPet(Optional<Pet> pet) {
        this.pet = pet;
    }
}
public class zubko_zadanie_8{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Map<String, List<String>> petNamesByCity = people.stream()
            .collect(Collectors.groupingBy(
                Person::getCity,
                Collectors.flatMapping(
                    person -> person.getPet().map(Pet::getName).stream(),
                    Collectors.toList()
                )
            ));
    }
}
