class Solution {
    
    // Constructor Overloading
    public Solution() {
        System.out.println("Default constructor called");
    }

    public Solution(int a) {
        System.out.println("Parameterized constructor called with one parameter: " + a);
    }

    public Solution(int a, int b) {
        System.out.println("Parameterized constructor called with two parameters: " + a + " and " + b);
    }

    // Method Overloading
    public void display() {
        System.out.println("Display method with no parameters");
    }

    public void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Display method with two parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
System.out.println("32421-Shubham Jagtap");
        // Demonstrating Constructor Overloading
        Solution obj1 = new Solution();           // Default constructor
        Solution obj2 = new Solution(10);         // Constructor with one parameter
        Solution obj3 = new Solution(10, 20);     // Constructor with two parameters

        // Demonstrating Method Overloading
        obj1.display();                           // Display method with no parameters
        obj1.display(100);                        // Display method with one parameter
        obj1.display(100, 200);                   // Display method with two parameters
    }
}
