import java.util.ArrayList;
import java.util.List;

public class NumberCollection {

    private final List<Integer> numbers;

    public NumberCollection(List<Integer> numbers) {
        // Defensive copy
        this.numbers = new ArrayList<>(numbers);
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public int size() {
        return numbers.size();
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
