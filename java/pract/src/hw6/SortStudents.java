package hw6;

public class SortStudents {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student(1230, "1", 0.9f);
        students[1] = new Student(4321, "2", 1.4f);
        students[2] = new Student(5616, "3", 5.2f);
        students[3] = new Student(6354, "4", 0.0f);
        students[4] = new Student(2354, "5", 10.0f);
        students[5] = new Student(2327, "6", 9.4f);
        students[6] = new Student(3520, "7", 5.7f);
        students[7] = new Student(5238, "8", 8.2f);
        students[8] = new Student(6734, "9", 1.9f);
        students[9] = new Student(2452, "10", 2.4f);

        System.out.println("SORTED WITH SELECTION SORT:");
        Sortings.selectionSort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }

        System.out.println("SORTED WITH QUICK SORT:");
        Sortings.qSort(students, new StudentsGPAComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }
    }
}
