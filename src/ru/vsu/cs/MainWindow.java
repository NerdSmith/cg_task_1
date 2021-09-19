package ru.vsu.cs;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setSize(900, 600);
        this.setTitle("One way plane");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(new DrawPanel());
    }
}
