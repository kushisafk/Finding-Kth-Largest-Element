import java.util.List;

public class Validator {

    public static void validateNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Number list cannot be null or empty.");
        }
    }

    public static void validateK(int k, int n) {
        if (k < 1 || k > n) {
            throw new IllegalArgumentException(
                    "Invalid value of K. K must be between 1 and " + n + "."
            );
        }
    }
}
