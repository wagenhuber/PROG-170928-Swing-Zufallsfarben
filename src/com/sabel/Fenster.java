package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenster extends JFrame {

    private Container con;
    private double rgb1;
    private double rgb2;
    private double rgb3;


    public Fenster() {


        super("Zufallsfarben");

        con = this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initEvents();

        this.setSize(300, 200);
        this.setVisible(true);


    }

    private void initEvents() {
        MeinInnererMouseListener miml = new MeinInnererMouseListener();
        con.addMouseListener(miml);
    }


    public class MeinInnererMouseListener extends MouseAdapter {


        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse fährt in das Fenster!");
            rgb1 = Math.random();
            rgb2 = Math.random();
            rgb3 = Math.random();

            con.setBackground(Color.getHSBColor((float) rgb1, (float) rgb2, (float) rgb3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse verlässt das Fenster!");
            con.setBackground(Color.white);
        }
    }


}
