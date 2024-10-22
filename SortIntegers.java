import java.util.Arrays;
import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for integers
        System.out.print("Enter the number of integers you want to sort: ");
        int numCount = scanner.nextInt();
        int[] numbers = new int[numCount];

        System.out.println("Enter the integers:");
        for (int i = 0; i < numCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting the list of integers
        Arrays.sort(numbers);
        System.out.println("Sorted List of Integers: " + Arrays.toString(numbers));

        scanner.close();
    }
}
