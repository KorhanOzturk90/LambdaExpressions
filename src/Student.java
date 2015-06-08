/**
 * Domain class for defining a student.
 */
public class Student {

    private long id;
    private String name;
    private String course;
    private int age;

    public Student(long id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String toString(){
        return id + " " + name + " " + age;
    }

}
