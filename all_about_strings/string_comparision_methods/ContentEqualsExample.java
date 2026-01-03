package all_about_strings.string_comparision_methods;

public class ContentEqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        StringBuffer strBuffer = new StringBuffer("Hello World");
        StringBuilder strBuilder = new StringBuilder("Hello World");
        String str2 = "Java";

        // Comparing String to StringBuffer
        boolean result1 = str1.contentEquals(strBuffer);
        System.out.println("str1 content equals strBuffer: " + result1); // Output: true

        // Comparing String to StringBuilder (via CharSequence interface)
        boolean result2 = str1.contentEquals(strBuilder);
        System.out.println("str1 content equals strBuilder: " + result2); // Output: true

        // Comparing to another String with different content
        boolean result3 = str1.contentEquals(str2);
        System.out.println("str1 content equals str2: " + result3); // Output: false

        // Comparing two String literals
        String str3 = "Hello World";
        System.out.println("str1 content equals str3: " + str1.contentEquals(str3)); // Output: true
    }
}

