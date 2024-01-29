package hw4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    private JPanel[] pnl;
    private JButton buttonMilan;
    private JButton buttonMadrid;
    private JLabel result;
    private JLabel lastScorer;
    private Label winner;
    private Integer MilanScore;
    private Integer MadridScore;

    public Football() {
        super("Football");
        setSize(600, 400);

        pnl = new JPanel[9];
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        buttonMilan = new JButton("AC Milan");
        buttonMadrid = new JButton("Real Madrid");
        result = new JLabel("Result: 0 x 0");
        lastScorer = new JLabel("Last Scorer: N/A");
        winner = new Label("Winner: DRAW");

        MilanScore = 0;
        MadridScore = 0;

        pnl[3].add(buttonMilan);
        pnl[5].add(buttonMadrid);
        pnl[1].add(result);
        pnl[4].add(lastScorer);
        pnl[7].add(winner);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastScorer.setText("Last Scorer: AC Milan");
                MilanScore++;
                updateResult();
                updateWinner();
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastScorer.setText("Last Scorer: Real Madrid");
                MadridScore++;
                updateResult();
                updateWinner();
            }
        });
    }

    private void updateResult() {
        result.setText("Result: " + MilanScore.toString() + " x " + MadridScore.toString());
    }

    private void updateWinner() {
        if (MilanScore > MadridScore) {
            winner.setText("Winner: AC Milan");
        }
        else if (MilanScore < MadridScore) {
            winner.setText("Winner: Real Madrid");
        }
        else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Football().setVisible(true);
    }
}