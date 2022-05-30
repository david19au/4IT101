import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "B");

        Optional<String> first = set.stream()
                .filter(s -> s.startsWith("C"))
                .findFirst();

        String test = first.orElse("Nic tu není");

        System.out.println(test);

    }
}
