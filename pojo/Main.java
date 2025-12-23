package pojo;

public class Main {


    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Student student = new Student("S92300" + i,
                    switch (i){
                        case 0 -> "Alice Johnson";
                        case 1 -> "Bob Smith";
                        case 2 -> "Charlie Brown";
                        case 3 -> "Diana Prince";
                        case 4 -> "Ethan Hunt";
                        default -> "Anonymous";
                    },
                    "1998/08/21",
                    "Java Masterclass"
            );
            System.out.println(student);
        }

    }
}
