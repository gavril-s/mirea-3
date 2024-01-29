package hw5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(digitSum(N));
    }

    private static int digitSum(int N) {
        if (N == 0) {
            return 0;
        }

        return (N % 10) + digitSum(N / 10);
    }
}
