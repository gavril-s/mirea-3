package hw6;

import java.util.ArrayList;
import java.util.Comparator;

public class Sortings {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
                temp = list[min];
                list[min] = list[index];
                list[index] = temp;
            }
        }
    }

    public static void qSort(Object[] array, Comparator comp) {
        qSort(array, array.length - 1, 0, comp);
    }

    public static void qSort(Object[] array, int high, int low, Comparator comp) {
        if (array == null || array.length == 0) {
            return;
        }
        if (high <= low) {
            return;
        }

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();

        for (int i = low; i <= high; i++) {
            if (comp.compare(array[i], middle) > 0) {
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0) {
                left.add(array[i]);
            }
            else {
                eq.add(array[i]);
            }
        }

        Object[] leftArr;
        Object[] rightArr;
        if (left.size() > 0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0, comp);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if (right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0, comp);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }
    }
}
