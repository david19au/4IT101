import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main3 {

    public static void main(String[] args) {
        String neco = "neco";
        Car car = new Car();
        Supplier<String> supplier = supplier();
        System.out.println(supplier.get());

        Consumer<String> consumer = (System.out::println);
        consumer.accept(supplier.get());
    }

    public static Supplier<String> supplier() {
        String test = "AHOJ";
        return () -> test;
    }

}
