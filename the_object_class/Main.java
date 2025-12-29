package the_object_class;

public class Main extends Object {

    public static void main(String[] args) {
        Student student = new Student("Sandesh", 28);
        System.out.println(student.toString());
        PrimarySchoolStudent pStudent = new PrimarySchoolStudent("Ranjit", 10, "Suresh");
        System.out.println(pStudent);
    }
}

// Remember only one class in a java source file can be public, and since we already have Main as public, So Student can't be public.
class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}

