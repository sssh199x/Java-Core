package expressions_statements_blocks.methods.basic_methods;

/**
 * Managing Flour Pack Requirements With Limited Bucket Sizes
 * 
 * This class demonstrates:
 * 1. Solving optimization problems with constraints
 * 2. Using only full bags (no partial bags allowed)
 * 3. Greedy algorithm approach (use big bags first)
 * 4. Input validation for negative parameters
 * 5. Handling edge cases and remainder calculations
 * 
 * Problem: Determine if we can pack goal kilos using big bags (5 kilos each)
 * and small bags (1 kilo each), where only full bags can be used.
 */
public class FlourPacker {

    /**
     * Determines if it's possible to pack goal kilos using available bags.
     * 
     * Strategy:
     * 1. Use as many big bags (5 kilos) as possible without exceeding goal
     * 2. Use small bags (1 kilo) to fill the remainder
     * 3. Only full bags can be used (no splitting big bags)
     * 
     * @param bigCount the number of big flour bags (5 kilos each)
     * @param smallCount the number of small flour bags (1 kilo each)
     * @param goal the goal amount of kilos needed
     * @return true if it's possible to make a package with goal kilos, false otherwise
     * 
     * Examples:
     * canPack(1, 0, 4); → returns false (can't use partial big bag, need 4 but only have 5-kilo bag)
     * canPack(1, 0, 5); → returns true (1 big bag = 5 kilos, exactly matches goal)
     * canPack(0, 5, 4); → returns true (4 small bags = 4 kilos, 1 bag leftover is ok)
     * canPack(2, 2, 11); → returns true (2 big bags = 10, 1 small bag = 1, total 11)
     * canPack(-3, 2, 12); → returns false (bigCount is negative)
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // If any of the parameters are negative, return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        
        // Calculate total available flour
        int totalAvailable = (bigCount * 5) + smallCount;
        
        // If total available is less than goal, we can't pack it
        if (totalAvailable < goal) {
            return false;
        }
        
        // Use greedy approach: use as many big bags as possible
        // Maximum big bags we can use = minimum of available big bags and goal/5
        // (We can't use more big bags than we have, and we can't use more than goal/5)
        int maxBigBagsToUse = Math.min(bigCount, goal / 5);
        
        // Calculate how many kilos the big bags will cover
        int kilosFromBigBags = maxBigBagsToUse * 5;
        
        // Calculate remaining kilos needed after using big bags
        int remainingKilos = goal - kilosFromBigBags;
        
        // Check if we have enough small bags to cover the remainder
        // If smallCount >= remainingKilos, we can pack it
        return smallCount >= remainingKilos;
    }

    /**
     * Alternative implementation with explicit step-by-step logic.
     * 
     * This version breaks down the logic more explicitly for clarity.
     * 
     * @param bigCount the number of big flour bags (5 kilos each)
     * @param smallCount the number of small flour bags (1 kilo each)
     * @param goal the goal amount of kilos needed
     * @return true if it's possible to make a package with goal kilos, false otherwise
     */
    public static boolean canPackAlternative(int bigCount, int smallCount, int goal) {
        // Validate parameters
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        
        // Check if we have enough total flour
        int totalFlour = (bigCount * 5) + smallCount;
        if (totalFlour < goal) {
            return false;
        }
        
        // Try to use big bags first
        // We can use at most goal/5 big bags (since each is 5 kilos)
        // But we can't use more than we have
        int bigBagsNeeded = goal / 5;
        int bigBagsToUse = Math.min(bigBagsNeeded, bigCount);
        
        // Calculate what's left after using big bags
        int remaining = goal - (bigBagsToUse * 5);
        
        // Check if small bags can cover the remainder
        return smallCount >= remaining;
    }
}

