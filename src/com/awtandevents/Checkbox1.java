/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awtandevents;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Admin
 */
public class Checkbox1 {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox");
        
        Checkbox c1 = new Checkbox("Java", true);
        c1.setBounds(100,100, 50,50);
        Checkbox c2 = new Checkbox("CPP", true);       
        c2.setBounds(100,150, 50,50);
        
        f.add(c1);
        f.add(c2);
        
        f.setSize(300, 250);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        
        
    }
}
