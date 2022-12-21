package ru.agcon.new_labs.laba16.zadanie2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Menu extends JFrame {

    private Font fnt1 = new Font("Times new roman",Font.PLAIN,20);
    private Font fnt2 = new Font("MS Sans Serif",Font.PLAIN,20);
    private Font fnt3 = new Font("Courier New",Font.PLAIN,20);
    JTextArea txtArea = new JTextArea();

    public Menu() {
        this.setSize(800, 800);
        txtArea.setFont(fnt1);
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(choose_font());
        jMenuBar.add(choose_color());
        setJMenuBar(jMenuBar);
        add(txtArea);
    }

    private JMenu choose_font(){
        JMenu font = new JMenu("Шрифт");
        JRadioButtonMenuItem font1 = new JRadioButtonMenuItem("Times new roman");
        font1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setFont(fnt1);
            }
        });
        JRadioButtonMenuItem font2 = new JRadioButtonMenuItem("MS Sans Serif");
        font2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setFont(fnt2);
            }
        });
        JRadioButtonMenuItem font3 = new JRadioButtonMenuItem("Courier New");
        font3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setFont(fnt3);
            }
        });
        ButtonGroup bg = new ButtonGroup();
        bg.add(font1);
        bg.add(font2);
        bg.add(font3);
        font.add(font1);
        font.add(font2);
        font.add(font3);
        return font;
    }

    private JMenu choose_color(){
        JMenu color = new JMenu("Цвет");
        JRadioButtonMenuItem color1 = new JRadioButtonMenuItem("Синий");
        color1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setForeground(Color.BLUE);
            }
        });
        JRadioButtonMenuItem color2 = new JRadioButtonMenuItem("Красный");
        color2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setForeground(Color.RED);
            }
        });
        JRadioButtonMenuItem color3 = new JRadioButtonMenuItem("Чёрный");
        color3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                txtArea.setForeground(Color.BLACK);
            }
        });
        ButtonGroup bg = new ButtonGroup();
        bg.add(color1);
        bg.add(color2);
        bg.add(color3);
        color.add(color1);
        color.add(color2);
        color.add(color3);
        return color;
    }

    public static void main(String[]args)
    {
        Menu menu = new Menu();
        menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
}
