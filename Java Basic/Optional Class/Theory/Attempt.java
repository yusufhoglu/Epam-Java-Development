import java.util.Optional;

public class Attempt {
    public static void main(String[] args) {
        String name = "yusuf";
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(value -> System.out.println("Value is present: " + value));

    }

}
