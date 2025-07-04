import java.util.List;

public class StudentGroup {
    private final Teacher teacher;
    private final List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Student group led by " + teacher + " with students: " + students;
    }
}
