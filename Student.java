import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String dept;

    private String grade;

    public Student(String name, int age, String dept, String grade) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public String getGrade() {
        return grade;
    }
}

class StdurntApp {
    public static void main(String[] args) {

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Mamin", 20, "CSE", "A"));
        students1.add(new Student("Rahman", 21, "CSE", "B"));
        students1.add(new Student("Rahim", 22, "CSE", "C"));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Karim", 23, "CSE", "D"));
        students2.add(new Student("Babu", 24, "CSE", "E"));
        students2.add(new Student("Rahman", 25, "CSE", "F"));

        List<List<Student>> allStudents = new ArrayList<>();
        allStudents.add(students1);
        allStudents.add(students2);

        allStudents.stream().flatMap(s -> s.stream().filter(g -> g.getGrade().equals("A")).map(st -> st.getName()))
                .forEach(System.out::println);
    }
}
