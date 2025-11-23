public class KthLargestService {

    private KthLargestStrategy strategy;

    public KthLargestService(KthLargestStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(KthLargestStrategy strategy) {
        this.strategy = strategy;
    }

    public Result computeKthLargest(NumberCollection collection, int k) {
        Validator.validateNumbers(collection.getNumbers());
        Validator.validateK(k, collection.size());

        long startTime = System.currentTimeMillis();
        int value = strategy.findKthLargest(collection.getNumbers(), k);
        long endTime = System.currentTimeMillis();

        return new Result(value, strategy.getName(), endTime - startTime);
    }
}
