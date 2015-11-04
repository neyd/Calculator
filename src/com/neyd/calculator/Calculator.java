package com.neyd.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;

/**
 * Created by Женя on 02.11.2015.
 */
public class Calculator extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bP, bM, bG, bD, bR, bC,bK,bDot, bKor, bCos, bSin;
    JLabel l1, l2, l3, l4;
    JTextField t1;
    String sing;
    double i;
    double k;
    double r;
    String a = "";
    String b = "";
    eHandler handler = new eHandler();

    public Calculator(String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("  1  ");
        b2 = new JButton("  2  ");
        b3 = new JButton("  3  ");
        b4 = new JButton("  4  ");
        b5 = new JButton("  5  ");
        b6 = new JButton("  6  ");
        b7 = new JButton("  7  ");
        b8 = new JButton("  8  ");
        b9 = new JButton("  9  ");
        b0 = new JButton("  0  ");
        bP = new JButton("+");
        bM = new JButton("-");
        bG = new JButton("*");
        bD = new JButton("/");
        bR = new JButton("=");
        bC = new JButton(" C ");
        bK = new JButton(" 2 ");
        bDot = new JButton(" . ");
        bKor = new JButton(" K ");
        bCos = new JButton("Cos");
        bSin = new JButton("Sin");
        l1 = new JLabel("");
        l2 = new JLabel("                                                           ");
        l3 = new JLabel("                   ");
        l4 = new JLabel("                   ");
        t1 = new JTextField(15);
        add(l1);
        add(l2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bKor);
        add(b0);
        add(bDot);
        add(bD);
        add(bP);
        add(bM);
        add(bG);
        add(bD);
        add(bSin);
        add(bCos);
        add(bK);
        add(bC);
        add(bR);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
        bP.addActionListener(handler);
        bR.addActionListener(handler);
        bM.addActionListener(handler);
        bC.addActionListener(handler);
        bG.addActionListener(handler);
        bD.addActionListener(handler);
        bDot.addActionListener(handler);
        bK.addActionListener(handler);
        bKor.addActionListener(handler);
        bCos.addActionListener(handler);
        bSin.addActionListener(handler);
    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == bKor) {
                    i = Double.parseDouble(a);
                    k = Math.sqrt(i);
                    l1.setText(Double.toString(k));
                    a = Double.toString(k);
                }
                if (e.getSource() == bCos) {
                    i = Double.parseDouble(a);
                    k = Math.cos(i);
                    l1.setText(Double.toString(k));
                    a = Double.toString(k);
                }
                if (e.getSource() == bSin) {
                    i = Double.parseDouble(a);
                    k = Math.sin(i);
                    l1.setText(Double.toString(k));
                    a = Double.toString(k);
                }
                if (e.getSource() == bK) {
                    i = Double.parseDouble(a);
                    k = i*i;
                    l1.setText(Double.toString(k));
                    a = Double.toString(k);
                }
                if (e.getSource() == bM) {
                    sing = "minus";
                    i = Double.parseDouble(a);
                    l1.setText("");
                    a = "";
                    k = i;
                }
                if (e.getSource() == bP) {
                    sing = "plus";
                    i = Double.parseDouble(a);
                    l1.setText("");
                    a = "";
                    k = i;
                }
                if (e.getSource() == bG) {
                    sing = "generation";
                    i = Double.parseDouble(a);
                    l1.setText("");
                    a = "";
                    k = i;
                }
                if (e.getSource() == bD) {
                    sing = "division";
                    i = Double.parseDouble(a);
                    l1.setText("");
                    a = "";
                    k = i;
                }
                if (e.getSource() == bR) {
                    if (sing.equals("plus")) {
                        i = Double.parseDouble(a);
                        k = k + i;
                        l1.setText(Double.toString(k));
                        a = Double.toString(k);
                        sing = "";
                    }
                    if (sing.equals("minus")) {
                        i = Double.parseDouble(a);
                        k = k - i;
                        l1.setText(Double.toString(k));
                        a = Double.toString(k);
                        sing = "";
                    }
                    if (sing.equals("generation")){
                        i = Double.parseDouble(a);
                        k = k * i;
                        l1.setText(Double.toString(k));
                        a = Double.toString(k);
                        sing = "";
                    }
                    if (sing.equals("division")){
                        i = Double.parseDouble(a);
                        k = k / i;
                        l1.setText(Double.toString(k));
                        a = Double.toString(k);
                        sing = "";
                    }
                }
                if (e.getSource() == bC) {
                    a = "";
                    l1.setText("");
                    k = 0;
                    i = 0;
                }
                if (e.getSource() == b1) {
                    a = a + "1";
                    l1.setText(a);
                }
                if (e.getSource() == b2) {
                    a = a + "2";
                    l1.setText(a);
                }
                if (e.getSource() == b3) {
                    a = a + "3";
                    l1.setText(a);
                }
                if (e.getSource() == b4) {
                    a = a + "4";
                    l1.setText(a);
                }
                if (e.getSource() == b5) {
                    a = a + "5";
                    l1.setText(a);
                }
                if (e.getSource() == b6) {
                    a = a + "6";
                    l1.setText(a);
                }
                if (e.getSource() == b7) {
                    a = a + "7";
                    l1.setText(a);
                }
                if (e.getSource() == b8) {
                    a = a + "8";
                    l1.setText(a);
                }
                if (e.getSource() == b9) {
                    a = a + "9";
                    l1.setText(a);
                }
                if (e.getSource() == b0) {
                    a = a + "0";
                    l1.setText(a);
                }
                if (e.getSource() == bDot) {
                    a = a + ".";
                    l1.setText(a);
                }

            } catch (Exception ex) {
            }
        }
    }
}
