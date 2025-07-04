import java.util.List;

public class УчебнаяГруппаСервис {
    public УчебнаяГруппа сформироватьГруппу(Teacher teacher, List<Student> students) {
        return new УчебнаяГруппа(teacher, students);
    }
}
