import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("32421-Shubham Jagtap ");

        // Taking user input for names
        System.out.println("Enter the number of names you want to sort: ");
        int nameCount = scanner.nextInt();
        scanner.nextLine();  // Consume newline left by nextInt()
        String[] names = new String[nameCount];

        System.out.println("Enter the names:");
        for (int i = 0; i < nameCount; i++) {
            names[i] = scanner.nextLine();
        }

        // Sorting the list of names
        Arrays.sort(names);
        System.out.println("Sorted List of Names: " + Arrays.toString(names));

        scanner.close();
    }
}
