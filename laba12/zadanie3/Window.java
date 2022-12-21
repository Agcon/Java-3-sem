package ru.agcon.new_labs.laba12.zadanie3;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JLabel imgLabel;
    private int imgCounter = 1;

    public Window(){
        this.setSize(1500, 800);
        imgLabel = new JLabel(new ImageIcon("1.jpg"), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
        Timer timer = new Timer(160, e -> nextImg());
        timer.start();
    }

    private void nextImg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource((++imgCounter)+".jpg"));
        Image image= imageIcon.getImage().getScaledInstance(500, 700, Image.SCALE_SMOOTH);
        imageIcon=new ImageIcon(image);
        imgLabel.setIcon(imageIcon);
        if(imgCounter == 8) imgCounter = 0;
    }

    public static void main(String[]args)
    {
        Window window = new Window();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
