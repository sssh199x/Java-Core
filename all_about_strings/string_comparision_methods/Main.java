package all_about_strings.string_comparision_methods;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World";

        if(helloWorld.equals(helloWorld.toLowerCase())){
            System.out.println("Values match exactly (case-sensitive).");
        }
        if(helloWorld.equalsIgnoreCase(helloWorld.toLowerCase())){
            System.out.println("Values match exactly ignoring (case-sensitive).");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("The string starts with Hello.");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("The string ends with World.");
        }
        if(helloWorld.contains("World")){
            System.out.println("The string contains World.");
        }
        // Use contentEquals to compare string with a CharSequence or any other object that implements CharSequence interface.
        // Such as StringBuffer, StringBuilder or String itself etc.
        // This is not possible with equals method.
        // Use equals() when you are comparing two objects that you know are both String instances.
        // Internally, if both are strings, contentEquals() often calls equals() anyway.
        // Use contentEquals() when you need to compare a String to an object that might be a StringBuffer, StringBuilder, or another class implementing CharSequence.
        // This avoids the inefficiency of creating an intermediate String object just for comparison.

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly (case-sensitive).");
        }
    }
}
