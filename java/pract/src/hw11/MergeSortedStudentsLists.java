package hw11;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedStudentsLists {
    public static void main(String[] args) {
        List<Student> firstList = new ArrayList<>();
        firstList.add(new Student(1, "John", 3.8f));
        firstList.add(new Student(4, "Olivia", 3.7f));
        firstList.add(new Student(5, "Michael", 4.0f));

        List<Student> secondList = new ArrayList<>();
        secondList.add(new Student(2, "Andrew", 3.9f));
        secondList.add(new Student(3, "Emma", 3.6f));
        secondList.add(new Student(6, "Sophia", 3.5f));

        List<Student> mergedList = mergeSortedLists(firstList, secondList);

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSortedLists(List<Student> firstList, List<Student> secondList) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i).compareTo(secondList.get(j)) <= 0) {
                mergedList.add(firstList.get(i));
                i++;
            } else {
                mergedList.add(secondList.get(j));
                j++;
            }
        }

        while (i < firstList.size()) {
            mergedList.add(firstList.get(i));
            i++;
        }

        while (j < secondList.size()) {
            mergedList.add(secondList.get(j));
            j++;
        }

        return mergedList;
    }
}