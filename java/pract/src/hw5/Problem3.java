package hw5;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        printRange(A, B);
    }

    private static void printRange(int begin, int end) {
        if (begin == end) {
            System.out.println(begin);
        }
        else {
            System.out.print(begin + " ");
            if (begin < end) {
                printRange(begin + 1, end);
            }
            else {
                printRange(begin - 1, end);
            }
        }
    }
}
