import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Ivan Petrov");

        Student s1 = new Student(101, "Maria Ivanova");
        Student s2 = new Student(102, "Alexey Smirnov");
        Student s3 = new Student(103, "Svetlana Kuznetsova");

        List<Student> students = List.of(s1, s2, s3);

        StudentGroupService service = new StudentGroupService();
        StudentGroup group = service.createGroup(teacher, students);

        System.out.println(group);
    }
}
