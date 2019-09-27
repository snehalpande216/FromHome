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
import java.util.logging.Level;

/**
 *
 * @author Admin
 */
public class TextField1 {
    public static void main(String[] args) {
        Frame f10 = new Frame("TextField");
        
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(10);
        
        
        
        Button b1 = new Button("+");
        Button b2 = new Button("-");
        
        f10.add(t1);
        f10.add(t2);
        f10.add(t3);
        f10.add(b1);
        f10.add(b2);
        
        f10.setVisible(true);
        f10.setSize(100, 200);
        f10.setLayout(new FlowLayout());
        
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int result = 0;
                int i1 = Integer.parseInt(s1);  
                int i2 = Integer.parseInt(s2);
                
                if(e.getSource()==b1){
                    result = i1+i2;
                }
                
                String textResult = String.valueOf(result);
                t3.setText(textResult);
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int result = 0;
                int i1 = Integer.parseInt(s1);  
                int i2 = Integer.parseInt(s2);
                
                if(e.getSource()==b2){
                    result = i1- i2;
                }
                
                String textResult = String.valueOf(result);
                t3.setText(textResult);
            }
        });
        
        
    }
}
