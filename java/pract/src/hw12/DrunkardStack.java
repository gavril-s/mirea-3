package hw12;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardStack {
    final private static int[] cardSet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static Stack<Integer> firstPlayerHand;
    private static Stack<Integer> secondPlayerHand;

    public static void main(String[] args) {
        firstPlayerHand = new Stack<Integer>();
        secondPlayerHand = new Stack<Integer>();

        Scanner scanner = new Scanner(System.in);

        Stack<Integer> cardInputBuffer = new Stack<Integer>();
        for (int i = 0; i < cardSet.length / 2; i++) {
            cardInputBuffer.push(scanner.nextInt());
        }
        for (int i = 0; i < cardSet.length / 2; i++) {
            firstPlayerHand.push(cardInputBuffer.pop());
        }
        for (int i = 0; i < cardSet.length / 2; i++) {
            cardInputBuffer.push(scanner.nextInt());
        }
        for (int i = 0; i < cardSet.length / 2; i++) {
            secondPlayerHand.push(cardInputBuffer.pop());
        }

        boolean end = false;
        int moves = 0;
        Stack<Integer> firstPlayerCardBuffer = new Stack<Integer>();
        Stack<Integer> secondPlayerCardBuffer = new Stack<Integer>();
        while (!end)
        {
            int firstPlayerCard = firstPlayerHand.pop();
            int secondPlayerCard = secondPlayerHand.pop();

            if ((firstPlayerCard == 0 && secondPlayerCard == 9) ||
                    ((firstPlayerCard > secondPlayerCard) &&
                            !(firstPlayerCard == 9 && secondPlayerCard == 0))) {
                firstPlayerCardBuffer.push(firstPlayerCard);
                firstPlayerCardBuffer.push(secondPlayerCard);
            }
            else if ((firstPlayerCard == 9 && secondPlayerCard == 0) ||
                    (secondPlayerCard > firstPlayerCard)) {
                secondPlayerCardBuffer.push(firstPlayerCard);
                secondPlayerCardBuffer.push(secondPlayerCard);
            }
            else {
                firstPlayerCardBuffer.push(firstPlayerCard);
                secondPlayerCardBuffer.push(secondPlayerCard);
            }

            if (firstPlayerHand.empty()) {
                while (!firstPlayerCardBuffer.empty()) {
                    firstPlayerHand.push(firstPlayerCardBuffer.pop());
                }
            }

            if (secondPlayerHand.empty()) {
                while (!secondPlayerCardBuffer.empty()) {
                    secondPlayerHand.push(secondPlayerCardBuffer.pop());
                }
            }

            moves++;
            if (firstPlayerHand.empty()) {
                System.out.println("#2 wins after " + moves + " moves");
                end = true;
            }
            if (secondPlayerHand.empty()) {
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
