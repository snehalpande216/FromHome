/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awtandevents;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Admin
 */
public class TextArea1 {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea");
        
        TextArea area = new TextArea();
        Label l1 = new Label();
        Label l2 = new Label();
        Button b = new Button("Count Words");
        
        area.setBounds(20,100,300,300);
        
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500, 500);
                 
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            String text = area.getText();
            String words[] = text.split("\\s");
            l1.setText("Words : " + words.length);
            l2.setText("Text : " + text.length());
            }
        });
    }
}
