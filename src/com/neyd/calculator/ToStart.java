package com.neyd.calculator;

import javax.swing.*;

/**
 * Created by Женя on 02.11.2015.
 */
public class ToStart {
    public static void main(String args[]){
        Calculator c = new Calculator("Калькулятор");
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(190, 300);
        c.setResizable(false);
        c.setLocationRelativeTo(null);

    }
}
