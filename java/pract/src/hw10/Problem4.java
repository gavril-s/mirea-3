package hw10;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int result = solve(k, s);
        System.out.println(result);
    }

    private static int solve(int k, int s) {
        return solve(k, s, true);
    }

    private static int solve(int k, int s, boolean root) {
        if (k == 1) {
            return ((s >= 0 && s <= 9) ? 1 : 0);
        }

        int result = 0;
        for (int i = (root ? 1 : 0); i < 10; i++) {
            result += solve(k - 1, s - i, false);
        }

        return result;
    }
}
