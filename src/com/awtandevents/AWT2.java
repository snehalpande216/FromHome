/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awtandevents;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.applet.Main;

/**
 *
 * @author Admin
 */
public class AWT2 {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame");
        
        Button b = new Button("Ok");
        
        Label l1 = new Label("First");
        Label l2 = new Label("Second");
        
        TextField tf1 = new TextField(10);
        TextField tf2 = new TextField(10);
        
        
        f.add(l1);
        f.add(tf1);
        f.add(l2);        
        f.add(tf2);
        f.add(b);
        
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
       
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = tf1.getText();
                tf1.setText(tf2.getText());
                tf2.setText(temp);
            }
        
        });
        
        
    }
}
