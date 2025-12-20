package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Developing A 'Barking Dog' Program For Boolean Logic Familiarity
 * 
 * We have a dog that likes to bark. We need to wake up if the dog is barking at night!
 * 
 * This class demonstrates:
 * 1. Boolean logic and conditional statements
 * 2. Multiple conditions with AND/OR operators
 * 3. Input validation
 * 4. Method with boolean return type
 * 
 * Logic:
 * - Wake up if dog is barking AND (hour < 8 OR hour > 22)
 * - Return false if hourOfDay is invalid (< 0 or > 23)
 * - Return false if dog is not barking
 */
public class BarkingDog {
    
    /**
     * Determines if we should wake up based on whether the dog is barking and the time of day.
     * 
     * @param barking true if the dog is currently barking, false otherwise
     * @param hourOfDay the hour of the day (valid range: 0-23)
     * @return true if we should wake up (dog is barking before 8 or after 22), false otherwise
     * 
     * Examples:
     * shouldWakeUp(true, 1); → should return true (barking before 8)
     * shouldWakeUp(false, 2); → should return false (dog not barking)
     * shouldWakeUp(true, 8); → should return false (not before 8, not after 22)
     * shouldWakeUp(true, -1); → should return false (invalid hour)
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // If the hourOfDay parameter is less than 0 or greater than 23, return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        
        // We have to wake up if the dog is barking before 8 or after 22 hours
        // Condition: barking AND (hourOfDay < 8 OR hourOfDay > 22)
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        
        // In all other cases return false
        return false;
    }
    
}

