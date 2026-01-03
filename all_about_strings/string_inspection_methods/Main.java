package all_about_strings.string_inspection_methods;

// All about String inspection methods in Java.
public class Main {
    public static void main(String[] args) {
        printInformation("Sandesh Hamal");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("Index of l which searches left to right = %d %n", helloWorld.indexOf('l'));
        System.out.printf("Index of l which searches right to left  = %d %n", helloWorld.lastIndexOf('l'));
        // The primary difference is the direction and occurrence:
        // the indexOf() method finds the position of the first occurrence of a specified value starting from the beginning,
        // Search Direction: Searches from the beginning of the string to the end (left-to-right).
        // while lastIndexOf() finds the position of the last occurrence starting from the end.
        // Search Direction: Searches from the end of the string to the beginning (right-to-left).
        System.out.printf("Index of l which searches left to right with another overloaded method = %d %n", helloWorld.indexOf('l',3));
        System.out.printf("Index of l which searches right to left with another overloaded method  = %d %n", helloWorld.lastIndexOf('l',8));

    }

    public static void printInformation(String string) {
        int length = string.length();
        if (string.isEmpty()) {
            System.out.println("The string is empty.");
            System.out.println("-----------------------------------");
            return;
        }
        if (string.isBlank()) {
            System.out.println("The string is blank.");
            System.out.println("-----------------------------------");
        }
        System.out.printf("Length of the string: %d %n", length);
        System.out.printf("Character at index 0: %c %n", string.charAt(0));
        System.out.printf("Character at last index: %c %n", string.charAt(length - 1));
        System.out.println("-----------------------------------");
        // isEmpty() checks if a string's length is 0, while isBlank() (introduced in Java 11) returns true if the string is empty or contains only whitespace characters.
        // The key distinction is how they treat whitespace (spaces, tabs, newlines, etc.):
        // isEmpty() returns false for a string with only whitespace because the string still has a length greater than 0.
        // isBlank() returns true for a string with only whitespace, considering it blank (effectively having no meaningful content).

        // Key Differences:
        // Definition of "Empty": isEmpty() adheres strictly to a length of zero.
        // Definition of "Blank": isBlank() is a broader check, considering strings containing only whitespace characters to be blank.
        // Performance: isEmpty() is slightly faster as it only checks an integer length (O(1)), whereas isBlank() might iterate through the string to check each character (O(n)).
        // Usage Context:
        // Use isEmpty() when you need to confirm there are absolutely no characters in the string.
        // Use isBlank() (often more useful for user input) when you want to treat a string full of spaces as having no value.
    }



}

