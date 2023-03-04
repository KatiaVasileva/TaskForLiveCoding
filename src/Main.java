import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список.

        List<String> names = new ArrayList<>();
        names.add("MJones");
        names.add("KSmith");
        names.add("SDavis");
        names.add("PLowrence");

        List<String> sortedNames = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}
