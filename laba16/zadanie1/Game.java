package ru.agcon.new_labs.laba16.zadanie1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Game extends JFrame {
    public Game() {
        super("Game");
        this.setSize(400, 260);
        this.setLayout(new BorderLayout());
        final JTextField userInput = new JTextField();
        this.add(userInput, BorderLayout.CENTER);
        JButton userButton = new JButton("Угадать");
        this.add(userButton, "South");
        final int[] counter = new int[]{0};
        final Integer iProgrammValue = ThreadLocalRandom.current().nextInt(0, 50);
        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (userInput.getText().toString() != "") {
                    if (userInput.getText().toString().equals(iProgrammValue.toString())) {
                        JOptionPane.showMessageDialog(Game.this.getContentPane(), "Отлично.", "Ты угадал!", -1);
                        Game.this.setVisible(false);
                        Game.this.dispose();
                    } else if (counter[0] == 2) {
                        JOptionPane.showMessageDialog(Game.this.getContentPane(), "Ты проиграл, теперь умрёшь.", "Прощай!", -1);
                        Game.this.setVisible(false);
                        Game.this.dispose();
                    } else {
                        int var10002 = counter[0]++;
                        if (Integer.parseInt(userInput.getText().toString()) > iProgrammValue) {
                            JOptionPane.showMessageDialog(Game.this.getContentPane(), "Мое число меньше", "Хорошая попытка.", -1);
                        } else {
                            JOptionPane.showMessageDialog(Game.this.getContentPane(), "Мое число больше", "Хорошая попытка.", -1);
                        }
                    }

                }
            }
        });
    }

    public static void main(String[] args) {
        (new Game()).setVisible(true);
    }
}