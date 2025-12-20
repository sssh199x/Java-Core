package datatypes.primitive;

/**
 * Learning about Boolean and Char Types in Java
 * Demonstrates boolean and char data types.
 */
public class BooleanAndChar {
    public static void main(String[] args) {
        // 1. boolean: represents true or false
        boolean isJavaFun = true;
        boolean isLearning = false;
        
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isLearning: " + isLearning);
        
        // Boolean operations
        System.out.println("\n--- Boolean Operations ---");
        boolean a = true;
        boolean b = false;
        System.out.println("a && b (AND): " + (a && b));
        System.out.println("a || b (OR): " + (a || b));
        System.out.println("!a (NOT): " + (!a));
        
        // Comparison operations return boolean
        int x = 10;
        int y = 20;
        System.out.println("\n--- Comparison Operations ---");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        
        // 2. char: 16-bit Unicode character
        char letter = 'A';
        char digit = '5';
        char symbol = '@';
        char unicode = '\u0041'; // Unicode for 'A'
        
        System.out.println("\n--- Character Examples ---");
        System.out.println("letter: " + letter);
        System.out.println("digit: " + digit);
        System.out.println("symbol: " + symbol);
        System.out.println("unicode (\\u0041): " + unicode);
        
        // Character operations
        System.out.println("\n--- Character Operations ---");
        char ch = 'B';
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + (int) ch);
        System.out.println("Next character: " + (char)(ch + 1));
        
        // Character array
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("\nCharacter array: " + new String(word));
    }
}

