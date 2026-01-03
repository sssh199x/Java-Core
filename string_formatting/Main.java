package string_formatting;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point\n";
        System.out.println(bulletIt);
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("I am %d years old.%n", age);
        int yearOfBirth = 2026 - age;
        System.out.printf("Age = %d, BirthYear = %d%n", age, yearOfBirth);

        System.out.printf("I am %.2f years old.%n", (float) age);

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing : %6d %n", i);
        }
        // We can also use format method of System class where ever we have used printf
        // System.out.format("Printing : %6d %n", i);
        // The String class itself has two methods to support this type of formatting as well.
        // One is a static method called format.
        String formattedString = String.format("Your age is %d%n", age);
        System.out.format(formattedString);
        // And another is String class instance method called formatted.
        String anotherFormattedString = "Your age is %d%n".formatted(age);
        System.out.println(anotherFormattedString);
    }
}
