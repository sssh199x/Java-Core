package expressions_statements_blocks.methods.basic_methods;

/**
 * Accurate MegaBytes Converter For Mastering Integer Math In Java
 * 
 * This class demonstrates:
 * 1. Integer division and remainder operations
 * 2. Method with void return type
 * 3. Input validation
 * 4. Formatted output with specific spacing requirements
 * 
 * Conversion: 1 MB = 1024 KB
 */
public class MegaBytesConverter {
    
    /**
     * Converts kilobytes to megabytes and remaining kilobytes, then prints the result.
     * 
     * @param kiloBytes the amount of kilobytes to convert
     * 
     * Examples:
     * printMegaBytesAndKiloBytes(2500); → prints: "2500 KB = 2 MB and 452 KB"
     * printMegaBytesAndKiloBytes(-1024); → prints: "Invalid Value"
     * printMegaBytesAndKiloBytes(5000); → prints: "5000 KB = 4 MB and 904 KB"
     * 
     * Calculation:
     * - Megabytes = kiloBytes / 1024 (integer division)
     * - Remaining Kilobytes = kiloBytes % 1024 (remainder operator)
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // If the parameter kiloBytes is less than 0, print "Invalid Value"
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Calculate megabytes using integer division
        // 1 MB = 1024 KB, so megabytes = kiloBytes / 1024
        int megaBytes = kiloBytes / 1024;
        
        // Calculate remaining kilobytes using remainder operator
        // Remaining KB = kiloBytes % 1024
        int remainingKiloBytes = kiloBytes % 1024;
        
        // Print in format: "XX KB = YY MB and ZZ KB"
        // Be extremely careful about spaces - exact format required
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
    
}

