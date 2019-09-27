/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awtandevents;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author Admin
 */
public class Label1 {
    public static void main(String[] args) {
        Frame f1 = new Frame("LABEL");
        
        Label l1 = new Label("First Name");
        Label l2 = new Label("Second Name");
        
        f1.add(l1);
        f1.add(l2);
        
        f1.setVisible(true);
        f1.setSize(400, 300);
        f1.setLayout(new FlowLayout());
        
        
    }
}
