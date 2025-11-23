import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public NumberCollection readNumberCollection() {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        return new NumberCollection(numbers);
    }

    public int readK() {
        System.out.print("Enter the value of K (1 = largest): ");
        return scanner.nextInt();
    }

    public KthLargestStrategy chooseStrategy() {
        System.out.println("\nChoose Strategy:");
        System.out.println("1. Sorting Based");
        System.out.println("2. Heap Based");
        System.out.println("3. QuickSelect Based");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return new SortingBasedStrategy();
            case 2:
                return new HeapBasedStrategy();
            case 3:
                return new QuickSelectStrategy();
            default:
                System.out.println("Invalid choice. Using Sorting Based Strategy by default.");
                return new SortingBasedStrategy();
        }
    }
}
