package hw11;

import hw6.Student;

import java.util.Comparator;

public class StudentsGPAComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        hw6.Student lhv = (hw6.Student)o1;
        hw6.Student rhv = (Student)o2;

        if (lhv.GPA == rhv.GPA) {
            return 0;
        }
        else if (lhv.GPA < rhv.GPA) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
