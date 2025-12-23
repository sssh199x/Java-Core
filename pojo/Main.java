package pojo;

import record.LPAStudent;

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
        System.out.println("------------------------------------------------------------------------------------------------------");
        Student pojoStudent = new Student("S923005", "Frank Castle", "1990/05/15", "Advanced Java");
        System.out.println(pojoStudent);
        System.out.println(pojoStudent.getName()    + "is taking classes in " + pojoStudent.getClassList());
        // Modifying the class list in pojo but this is not possible in record as they are immutable.
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Data Structures");


        // Using record
        // You cannot modify the fields of a record after its creation as they are final.
        // So if you want to modify data on your class , you won't be using record.
        // Instead, you can use the code generation options provided by your IDE to create POJOs with boilerplate code.
        // But if you are reading a whole lot of records from a database or a source file and you are simply passing this data around, then records is a big improvement.

        LPAStudent recordStudent = new LPAStudent("S923006", "Grace Hopper", "1985-12-09", "Computer Science");
        System.out.println(recordStudent);
        System.out.println(recordStudent.name()   + "is taking classes in " + recordStudent.classList());

    }
}
