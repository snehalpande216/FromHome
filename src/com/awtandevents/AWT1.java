/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awtandevents;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class AWT1 {
    public static void main(String[] args) {
        Frame f = new Frame("BUTTON");
        
        TextField tf = new TextField();
        Button b = new Button("Click Here");
        
        f.add(tf);
        f.add(b);
        
        f.setVisible(true);
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Heloo");
            }
        });
    }
    
}
