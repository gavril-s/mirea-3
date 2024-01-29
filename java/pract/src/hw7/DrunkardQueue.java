package hw7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardQueue {
    final private static int[] cardSet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static Queue<Integer> firstPlayerHand;
    private static Queue<Integer> secondPlayerHand;

    public static void main(String[] args) {
        firstPlayerHand = new ArrayDeque<Integer>();
        secondPlayerHand = new ArrayDeque<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cardSet.length / 2; i++) {
            firstPlayerHand.add(scanner.nextInt());
        }
        for (int i = 0; i < cardSet.length / 2; i++) {
            secondPlayerHand.add(scanner.nextInt());
        }

        boolean end = false;
        int moves = 0;
        while (!end)
        {
            int firstPlayerCard = firstPlayerHand.remove();
            int secondPlayerCard = secondPlayerHand.remove();

            if ((firstPlayerCard == 0 && secondPlayerCard == 9) ||
                    ((firstPlayerCard > secondPlayerCard) &&
                            !(firstPlayerCard == 9 && secondPlayerCard == 0))) {
                firstPlayerHand.add(firstPlayerCard);
                firstPlayerHand.add(secondPlayerCard);
            }
            else if ((firstPlayerCard == 9 && secondPlayerCard == 0) ||
                    (secondPlayerCard > firstPlayerCard)) {
                secondPlayerHand.add(firstPlayerCard);
                secondPlayerHand.add(secondPlayerCard);
            }
            else {
                firstPlayerHand.add(firstPlayerCard);
                secondPlayerHand.add(secondPlayerCard);
            }

            moves++;
            if (firstPlayerHand.isEmpty()) {
                System.out.println("#2 wins after " + moves + " moves");
                end = true;
            }
            if (secondPlayerHand.isEmpty()) {
                System.out.println("#1 wins after " + moves + " moves");
                end = true;
            }
            if (moves == 106) {
                System.out.println("botva");
                end = true;
            }
        }
    }
}
