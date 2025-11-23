import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);

        System.out.println("=== Kth Largest Element Finder (OOP in Java) ===");

        try {
            NumberCollection collection = inputHandler.readNumberCollection();
            int k = inputHandler.readK();
            KthLargestStrategy strategy = inputHandler.chooseStrategy();

            KthLargestService service = new KthLargestService(strategy);
            Result result = service.computeKthLargest(collection, k);

            System.out.println("\n--- Result ---");
            System.out.println("Input Numbers: " + collection);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("\nAn error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("\nProgram finished.");
    }
}
