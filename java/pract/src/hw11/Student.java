package hw11;

public class Student implements Comparable {
    public int id;
    public String name;
    public float GPA;

    public Student(int id, String name, float GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student)o;
        if (id == other.id) {
            return 0;
        }
        else if (id < other.id) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
