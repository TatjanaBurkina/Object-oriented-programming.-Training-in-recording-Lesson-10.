import java.util.List;

public class StudentGroupService {
    public StudentGroup createGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}
