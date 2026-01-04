package all_about_strings.string_manipulation_method;

public class Main {

    public static void main(String[] args) {
        String birthDate = "21/08/1998";
        int startingIndex = birthDate.indexOf("1998");
        System.out.println("Starting index of 1998 in birthDate: " + startingIndex);
        System.out.println("Birth Year extracted using substring: " + birthDate.substring(startingIndex));
        System.out.println("Birth Month extracted using substring: " + birthDate.substring(3, 5));
        String newDate = String.join( "/", "22", "08", "1998");
        System.out.println("New Date using join: " + newDate);

        newDate = "22";
        newDate = newDate.concat("/");
        newDate = newDate.concat("08");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1998");
        System.out.println("New Date using concat: " + newDate);


        newDate = "22" + "/" + "08" + "/" + "1998";
        System.out.println("New Date using + operator: " + newDate);

        newDate = "22".concat("/").concat("12").concat("/").concat("2000");
        System.out.println("New Date using multiple concat: " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(30));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(30));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(30));





    }
}
