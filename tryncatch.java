
import java.util.Scanner;

public class tryncatch {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            // This may throw an ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Error: Please enter valid integers.");
        } 
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally 
        {
            // This block executes regardless of whether an exception occurred or not
            System.out.println("Thank you for using the program!");
            scanner.close();
        }
    }
}

