import java.util.List;

public class Контроллер {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Иван Петров");

        Student s1 = new Student(101, "Мария Иванова");
        Student s2 = new Student(102, "Алексей Смирнов");
        Student s3 = new Student(103, "Светлана Кузнецова");

        List<Student> students = List.of(s1, s2, s3);

        УчебнаяГруппаСервис сервис = new УчебнаяГруппаСервис();
        УчебнаяГруппа группа = сервис.сформироватьГруппу(teacher, students);

        System.out.println(группа);
    }
}
