public class Result {

    private final int kthLargestValue;
    private final String strategyName;
    private final long executionTimeMillis;

    public Result(int kthLargestValue, String strategyName, long executionTimeMillis) {
        this.kthLargestValue = kthLargestValue;
        this.strategyName = strategyName;
        this.executionTimeMillis = executionTimeMillis;
    }

    public int getKthLargestValue() {
        return kthLargestValue;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public long getExecutionTimeMillis() {
        return executionTimeMillis;
    }

    @Override
    public String toString() {
        return "Kth Largest Element: " + kthLargestValue +
                "\nStrategy Used: " + strategyName +
                "\nExecution Time: " + executionTimeMillis + " ms";
    }
}
