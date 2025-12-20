package expressions_statements_blocks.methods.basic_methods;

/**
 * Implementing A Speed Converter To Practice Basic Java Arithmetic And Output
 * 
 * This class demonstrates:
 * 1. Method with return value and validation
 * 2. Method with void return type
 * 3. Using Math.round() for rounding
 * 4. Method calls from other methods
 * 5. Type conversion and arithmetic operations
 */
public class SpeedConverter {
    
    /**
     * Converts kilometers per hour to miles per hour.
     * 
     * @param kilometersPerHour the speed in kilometers per hour
     * @return the speed in miles per hour (rounded), or -1 if input is invalid
     * 
     * Examples:
     * toMilesPerHour(1.5); → should return value 1
     * toMilesPerHour(10.25); → should return value 6
     * toMilesPerHour(-5.6); → should return value -1
     * toMilesPerHour(25.42); → should return value 16
     * toMilesPerHour(75.114); → should return value 47
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        // If the parameter kilometersPerHour is less than 0, return -1 to indicate invalid value
        if (kilometersPerHour < 0) {
            return -1;
        }
        
        // Calculate miles per hour: 1 mile = 1.609 kilometers
        // So: miles = kilometers / 1.609
        double milesPerHour = kilometersPerHour / 1.609;
        
        // Round the value and return as long
        return Math.round(milesPerHour);
    }
    
    /**
     * Prints the conversion from kilometers per hour to miles per hour.
     * 
     * @param kilometersPerHour the speed in kilometers per hour
     * 
     * Examples:
     * printConversion(1.5); → should print: 1.5 km/h = 1 mi/h
     * printConversion(10.25); → should print: 10.25 km/h = 6 mi/h
     * printConversion(-5.6); → should print: Invalid Value
     * printConversion(25.42); → should print: 25.42 km/h = 16 mi/h
     * printConversion(75.114); → should print: 75.114 km/h = 47 mi/h
     */
    public static void printConversion(double kilometersPerHour) {
        // Call toMilesPerHour to get the converted value
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        
        // If the parameter kilometersPerHour is < 0, print "Invalid Value"
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            // Print in format: XX km/h = YY mi/h
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
    
}

