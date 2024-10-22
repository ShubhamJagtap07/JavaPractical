class Rectangle {
    // Data fields
    private double length;
    private double width;
    private double area;
    private String colour;

    // Constructor
    public Rectangle(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.area = find_area();
    }

    // Methods to get length, width, and colour
    public double get_length() {
        return length;
    }

    public double get_width() {
        return width;
    }

    public String get_colour() {
        return colour;
    }

    // Method to find area
    public double find_area() {
        return length * width;
    }

    // Method to compare two Rectangles
    public static void compare(Rectangle r1, Rectangle r2) {
        if (r1.find_area() == r2.find_area() && r1.get_colour().equals(r2.get_colour())) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-matching Rectangles");
        }
    }

    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(4.5, 3.0, "Blue");
        Rectangle rect2 = new Rectangle(4.5, 3.0, "Blue");

        // Compare their area and colour
        compare(rect1, rect2);
    }
}
