package method_overloading.examples;

/**
 * Area Calculator for Circles and Rectangles
 * 
 * This class demonstrates method overloading by providing two versions
 * of the area method:
 * 1. Calculate the area of a circle given its radius
 * 2. Calculate the area of a rectangle given its length and width
 * 
 * Both methods validate input parameters and return -1.0 for invalid values.
 */
public class AreaCalculator {

    /**
     * Calculates the area of a circle given its radius.
     * 
     * Formula: area = π * radius²
     * Uses Math.PI for the value of π (approximately 3.141592653589793)
     * 
     * @param radius The radius of the circle (must be non-negative)
     * @return The area of the circle, or -1.0 if radius is negative
     * 
     * Examples:
     * area(5.0) → 78.53981633974483
     * area(-1.0) → -1.0
     * area(0.0) → 0.0
     */
    public static double area(double radius) {
        // Validate input: radius must be non-negative
        if (radius < 0) {
            return -1.0; // Invalid value indicator
        }
        
        // Calculate circle area: π * radius²
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a rectangle given its length and width.
     * 
     * Formula: area = length * width
     * 
     * @param x The length of the rectangle (must be non-negative)
     * @param y The width of the rectangle (must be non-negative)
     * @return The area of the rectangle, or -1.0 if either parameter is negative
     * 
     * Examples:
     * area(5.0, 4.0) → 20.0
     * area(-1.0, 4.0) → -1.0
     * area(5.0, -1.0) → -1.0
     * area(-1.0, -1.0) → -1.0
     */
    public static double area(double x, double y) {
        // Validate input: both parameters must be non-negative
        if (x < 0 || y < 0) {
            return -1.0; // Invalid value indicator
        }
        
        // Calculate rectangle area: length * width
        return x * y;
    }
}

