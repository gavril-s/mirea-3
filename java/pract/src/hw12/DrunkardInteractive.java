package hw12;

import java.util.*;

public class DrunkardInteractive {
    final private static int[] cardSet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static Deque<Integer> firstPlayerHand;
    private static Deque<Integer> secondPlayerHand;

    public static void main(String[] args) {
        firstPlayerHand = new ArrayDeque<Integer>();
        secondPlayerHand = new ArrayDeque<Integer>();

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> cardsToDistribute = new ArrayList<Integer>();
        for (int i = 0; i < cardSet.length; i++) {
            cardsToDistribute.add(cardSet[i]);
        }
        Collections.shuffle(cardsToDistribute);

        System.out.print("Your cards are (from top to bottom): ");
        for (int i = 0; i < cardSet.length / 2; i++) {
            firstPlayerHand.add(cardsToDistribute.get(i));
            System.out.print(cardsToDistribute.get(i) + " ");
        }
        System.out.println();

        System.out.print("Your opponent's cards are (from top to bottom): ");
        for (int i = cardSet.length / 2; i < cardSet.length; i++) {
            secondPlayerHand.add(cardsToDistribute.get(i));
            System.out.print(cardsToDistribute.get(i) + " ");
        }
        System.out.println();

        boolean end = false;
        int moves = 0;
        while (!end)
        {
            System.out.println();
            System.out.print("Make a move (enter): ");
            String input = scanner.nextLine();
            if (!input.equals("\n") && !input.equals("")) {
                break;
            }

            int firstPlayerCard = firstPlayerHand.remove();
            int secondPlayerCard = secondPlayerHand.remove();

            System.out.println("Your card: " + firstPlayerCard);
            System.out.println("Opponent's card: " + secondPlayerCard);

            if ((firstPlayerCard == 0 && secondPlayerCard == 9) ||
                    ((firstPlayerCard > secondPlayerCard) &&
                            !(firstPlayerCard == 9 && secondPlayerCard == 0))) {
                System.out.println("You take the cards!");
                firstPlayerHand.add(firstPlayerCard);
                firstPlayerHand.add(secondPlayerCard);
            }
            else if ((firstPlayerCard == 9 && secondPlayerCard == 0) ||
                    (secondPlayerCard > firstPlayerCard)) {
                System.out.println("Your opponent takes the cards!");
                secondPlayerHand.add(firstPlayerCard);
                secondPlayerHand.add(secondPlayerCard);
            }
            else {
                System.out.println("You receive your cards back");
                firstPlayerHand.add(firstPlayerCard);
                secondPlayerHand.add(secondPlayerCard);
            }

            System.out.println("You are left with " + firstPlayerHand.size() + " cards");
            System.out.println("Your opponent is left with " + secondPlayerHand.size() + " cards");

            moves++;
            if (firstPlayerHand.isEmpty()) {
                System.out.println();
                System.out.println("You win after " + moves + " moves");
                end = true;
            }
            if (secondPlayerHand.isEmpty()) {
                System.out.println();
                System.out.println("Your opponent wins after " + moves + " moves");
                end = true;
            }
            if (moves == 106) {
                System.out.println();
                System.out.println("botva");
                end = true;
            }
        }
    }
}
