import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class QuickSelectStrategy implements KthLargestStrategy {

    private final Random random = new Random();

    @Override
    public int findKthLargest(List<Integer> numbers, int k) {
        // Convert to array for in-place partitioning
        ArrayList<Integer> listCopy = new ArrayList<>(numbers);
        int[] arr = listCopy.stream().mapToInt(Integer::intValue).toArray();

        int n = arr.length;
        int targetIndex = n - k; // kth largest == (n-k)th smallest (0-based)

        return quickSelect(arr, 0, n - 1, targetIndex);
    }

    private int quickSelect(int[] arr, int left, int right, int targetIndex) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);

        if (pivotIndex == targetIndex) {
            return arr[pivotIndex];
        } else if (targetIndex < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, targetIndex);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, targetIndex);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivotIndex = left + random.nextInt(right - left + 1);
        int pivotValue = arr[pivotIndex];

        swap(arr, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) { // partition by < for kth largest logic
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }

        swap(arr, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public String getName() {
        return "QuickSelect Strategy";
    }
}
