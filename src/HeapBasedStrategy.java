import java.util.PriorityQueue;
import java.util.List;

public class HeapBasedStrategy implements KthLargestStrategy {

    @Override
    public int findKthLargest(List<Integer> numbers, int k) {
        // Min-heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : numbers) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return minHeap.peek();
    }

    @Override
    public String getName() {
        return "Heap Based Strategy";
    }
}
