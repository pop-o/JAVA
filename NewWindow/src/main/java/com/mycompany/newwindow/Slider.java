/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
/**
 *
 * @author HP
 */
public class Slider implements ChangeListener {
    
    MyFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    Slider(){
        frame=new MyFrame();
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(300,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        slider.setPaintLabels(true);
        
        label.setText("Temp ="+slider.getValue()+" Degree Celsius");
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         
         label.setText("Temp ="+slider.getValue()+" Degree Celsius");
    }
    
}
