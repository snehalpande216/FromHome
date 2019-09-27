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
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Label2 {
    public static void main(String[] args) {
        Frame f2 = new Frame("Label With Action");
        
        Button b = new Button("Find IP");
        TextField tf = new TextField(30);
        
        Label l3 = new Label();
        l3.setVisible(true);
        
        f2.add(tf);
        f2.add(l3);
        f2.add(b);
        
        f2.setLayout(new FlowLayout());
        f2.setSize(500, 500);
        f2.setVisible(true);
        
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    String host = tf.getText();
                    String IP = java.net.InetAddress.getByName(host).getHostAddress();
                    l3.setText("IP of : " + host + " is : " + IP);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Label2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
}
