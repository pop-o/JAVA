/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author HP
 */
public class MyFrame extends JFrame implements ActionListener{

    JButton subBtn;
    JTextField textField;
    JCheckBox checkbox;
    ImageIcon icon;
    ImageIcon icon1;
    JRadioButton basketball;
    JRadioButton football;
    JRadioButton volleyball;
    JComboBox cbox;
    MyFrame(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
//        subBtn=new JButton("submit");
////        subBtn.setBounds(100,100,100,50);
//        subBtn.addActionListener(this);
//        subBtn.setFocusable(false);
//icon=new ImageIcon("A.png");
//icon1=new ImageIcon("B.png");
//        //checkbox
//        checkbox=new JCheckBox();
//        checkbox.setIcon(icon);
//        checkbox.setSelectedIcon(icon1);
////textfield
//        textField=new JTextField();
//        textField.setPreferredSize(new Dimension(100,100));
//        this.add(textField);
//        this.add(subBtn);
//        checkbox.addActionListener(this);
//        checkbox.setSize(100,100);
//            checkbox.setText("YOyoyoyoyoyo");
//            checkbox.setFont(new Font("Consolas",Font.PLAIN,40));
//
//this.add(checkbox);
//        ButtonGroup grp=new ButtonGroup();
//        
//        basketball=new JRadioButton("Basketball");
//        football=new JRadioButton("Football");
//        volleyball=new JRadioButton("Volleyball");
//        
//        basketball.addActionListener(this);
//        football.addActionListener(this);
//        volleyball.addActionListener(this);
//        
//        grp.add(basketball);    
//        grp.add(football);    
//        grp.add(volleyball);    
//        this.add(basketball);    
//        this.add(football);    
//        this.add(volleyball);    
//        //combobox
//        String[] items={"here","is","a","combo","box"};
//        cbox=new JComboBox(items);
//        cbox.addActionListener(this);
////        cbox.setEditable(true);
//        cbox.addItem("yoyo");
//        cbox.insertItemAt("hello",0);
//        cbox.setSelectedIndex(0);
//        cbox.removeItem("a");
//        cbox.removeItemAt(3);
//        this.add(cbox);
       
        this.pack();
        this.setSize(500,500);
        this.setVisible(true);
        
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==checkbox){
//            String content=textField.getText();
//            System.out.println("Content is: "+content);
//            subBtn.setEnabled(false);
////            textField.setEditable(false);
//            textField.setEnabled(false);
//                boolean x=checkbox.isSelected();
//                System.out.println(x);
         
//            if(e.getSource()==basketball){
//                System.out.println("You chose: basketball");
//        }   else  if(e.getSource()==football){
//                System.out.println("You chose: football ");
//        } else if(e.getSource()==volleyball){
//                System.out.println("You chose: volleyball");
//            if(e.getSource()==cbox){
//                System.out.println("You have selected: "+cbox.getSelectedItem());
//                System.out.println(cbox.getItemCount());
//                System.out.println("You have selected: "+cbox.getSelectedIndex());
//            }
    }
    
    
}
