import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        Student s7 = new Student(8, "Jan Vertoghen", "EE", 21);


        List<Student> students = new ArrayList<Student>();
        students.addAll(Arrays.asList(new Student[]{s1, s2, s3, s4, s5, s6, s7}));

        //filter student list based on given predicate
        List<Student> filteredList = students.stream().filter(StudentPredicates.isCSStudent()).collect(Collectors.toList());
        System.out.println(filteredList);

        filteredList = students.stream().filter(StudentPredicates.isOlderThan(19)).collect(Collectors.toList());
        System.out.println(filteredList);

        //Find the Students who are not taking CS course using negate() method
        filteredList = students.stream().filter(StudentPredicates.isCSStudent().negate()).collect(Collectors.toList());
        System.out.println(filteredList);

        //Sort the list on Student.Name using traditional sort method of Java.util.List
        students.sort(Comparator.comparing(x -> x.getName()));
        System.out.println(students);

        //Sorting the list using Stream.sorted on Student.Name should return the same list.
        System.out.println(students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList()));

        //Sort student list based on the age - all following three sort statements return the same list
        System.out.println(students.stream().sorted((x, y) -> Integer.compare(x.getAge(), y.getAge())).collect(Collectors.toList()));
        System.out.println(students.stream().sorted(Comparator.comparingInt(s -> s.getAge())).collect(Collectors.toList()));

        //use of forEach method to print sorted list
        students.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::print);
        System.out.print("\n");

        //Example use of map function
        students.stream().filter(StudentPredicates.isEEStudentAndHasEvenID())
                .map(x -> x.getName().toUpperCase()).forEach(x -> System.out.println("Student's Name in Capital: " + x));





    }
}
