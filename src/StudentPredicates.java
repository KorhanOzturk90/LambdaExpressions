import java.util.function.Predicate;

/**
 * Class defining predicates on Student class.
 */
public class StudentPredicates {

    public static Predicate<Student> isOlderThan(int age){
        return x-> x.getAge() > age;
    }

    public static Predicate<Student> isCSStudent(){
        return x-> x.getCourse().equalsIgnoreCase("CS");
    }

    public static Predicate<Student> isEEStudentAndHasEvenID() {
        return x -> x.getCourse().equalsIgnoreCase("EE") && x.getId()%2==0;
    }

}
