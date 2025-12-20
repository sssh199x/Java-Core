package expressions_statements_blocks.methods.basic_methods;

/**
 * Efficient Paint Job Planning With Bucket Calculations
 * 
 * This class demonstrates:
 * 1. Method overloading with different parameter lists
 * 2. Calculating area and bucket requirements
 * 3. Using Math.ceil() for rounding up
 * 4. Input validation for multiple parameters
 * 5. Handling edge cases (extra buckets, zero values)
 * 
 * Helps Bob calculate how many buckets of paint he needs to buy
 * based on wall dimensions or area, and existing buckets at home.
 */
public class PaintJobCalculator {

    /**
     * Calculates the number of buckets Bob needs to buy given wall dimensions,
     * area per bucket, and extra buckets at home.
     * 
     * @param width the width of the wall (must be > 0)
     * @param height the height of the wall (must be > 0)
     * @param areaPerBucket the area that can be covered with one bucket (must be > 0)
     * @param extraBuckets the number of buckets Bob has at home (must be >= 0)
     * @return the number of buckets to buy, or -1 if parameters are invalid
     * 
     * Examples:
     * getBucketCount(-3.4, 2.1, 1.5, 2); → returns -1 (width invalid)
     * getBucketCount(3.4, 2.1, 1.5, 2); → returns 3 (area 7.14, need 5, have 2)
     * getBucketCount(2.75, 3.25, 2.5, 1); → returns 3 (area 8.9375, need 4, have 1)
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Validate parameters
        // If width, height, or areaPerBucket is <= 0, return -1
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        
        // If extraBuckets is negative, return -1
        if (extraBuckets < 0) {
            return -1;
        }
        
        // Calculate wall area
        double wallArea = width * height;
        
        // Calculate total buckets needed (round up using Math.ceil)
        double bucketsNeededDouble = Math.ceil(wallArea / areaPerBucket);
        int bucketsNeeded = (int) bucketsNeededDouble;
        
        // Calculate buckets to buy (subtract extra buckets)
        int bucketsToBuy = bucketsNeeded - extraBuckets;
        
        // Can't return negative (if extra buckets cover everything, return 0)
        return Math.max(0, bucketsToBuy);
    }

    /**
     * Overloaded method: Calculates buckets needed without extra buckets.
     * 
     * This method assumes Bob has no extra buckets at home (extraBuckets = 0).
     * 
     * @param width the width of the wall (must be > 0)
     * @param height the height of the wall (must be > 0)
     * @param areaPerBucket the area that can be covered with one bucket (must be > 0)
     * @return the number of buckets to buy, or -1 if parameters are invalid
     * 
     * Examples:
     * getBucketCount(-3.4, 2.1, 1.5); → returns -1 (width invalid)
     * getBucketCount(3.4, 2.1, 1.5); → returns 5 (area 7.14, need 5 buckets)
     * getBucketCount(7.25, 4.3, 2.35); → returns 14 (area 31.175, need 14 buckets)
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // Validate parameters
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        
        // Calculate wall area
        double wallArea = width * height;
        
        // Calculate buckets needed (round up using Math.ceil)
        double bucketsNeededDouble = Math.ceil(wallArea / areaPerBucket);
        
        // Convert to int and return
        return (int) bucketsNeededDouble;
    }

    /**
     * Overloaded method: Calculates buckets needed when area is directly known.
     * 
     * This method is used when Bob knows the wall area but not the dimensions.
     * 
     * @param area the area of the wall (must be > 0)
     * @param areaPerBucket the area that can be covered with one bucket (must be > 0)
     * @return the number of buckets to buy, or -1 if parameters are invalid
     * 
     * Examples:
     * getBucketCount(3.4, 1.5); → returns 3 (area 3.4, need 3 buckets)
     * getBucketCount(6.26, 2.2); → returns 3 (area 6.26, need 3 buckets)
     * getBucketCount(3.26, 0.75); → returns 5 (area 3.26, need 5 buckets)
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        // Validate parameters
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        
        // Calculate buckets needed (round up using Math.ceil)
        double bucketsNeededDouble = Math.ceil(area / areaPerBucket);
        
        // Convert to int and return
        return (int) bucketsNeededDouble;
    }
}

