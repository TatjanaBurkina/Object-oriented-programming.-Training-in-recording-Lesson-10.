import java.util.List;

public class УчебнаяГруппа {
    private final Teacher teacher;
    private final List<Student> students;

    public УчебнаяГруппа(Teacher teacher, List<Student> students) {
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
        return "Учебная группа с преподавателем " + teacher + " и студентами: " + students;
    }
}
