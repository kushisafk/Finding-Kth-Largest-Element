import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortingBasedStrategy implements KthLargestStrategy {

    @Override
    public int findKthLargest(List<Integer> numbers, int k) {
        List<Integer> copy = new ArrayList<>(numbers);
        // Sort in descending order
        copy.sort(Collections.reverseOrder());
        return copy.get(k - 1); // k is 1-based
    }

    @Override
    public String getName() {
        return "Sorting Based Strategy";
    }
}
