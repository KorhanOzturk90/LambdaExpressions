import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Test class for demonstrating StudentPredicates.
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Gareth Bale", "EE", 22);
        Student s2 = new Student(2, "Hugo Lloris", "CS", 18);
        Student s3 = new Student(3, "Ledley King", "CS", 19);
        Student s4 = new Student(4, "Luka Modric", "IE", 20);
        Student s5 = new Student(5, "Harry Kane", "CS", 22);
        Student s6 = new Student(6, "Ryan Mason", "LAW", 20);
        Student s7 = new Student(7, "Jan Vertoghen", "EE", 21);


        List<Student> students = new ArrayList<Student>();
        students.addAll(Arrays.asList(new Student[]{s1, s2, s3, s4, s5, s6, s7}));

        System.out.println(students.stream().filter(StudentPredicates.isCSStudent()).collect(Collectors.toList()));
    }
}
