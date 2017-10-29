package com.shengsiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SwingTest {

    public static void main(String[] args){
        JFrame jFrame = new JFrame("JFrame");
        JButton jButton = new JButton("my button") ;
        jButton.addActionListener((ActionEvent event) -> System.out.println("hello world"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
