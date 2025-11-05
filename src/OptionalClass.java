import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> isCheckNull = Optional.ofNullable("Dk");
        System.out.println(isCheckNull.orElse("No values"));
    }
}
