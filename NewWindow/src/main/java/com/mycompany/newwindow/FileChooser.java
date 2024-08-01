/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 *
 * @author HP
 */
public class FileChooser extends JFrame implements ActionListener{
    
    JButton selectBtn=new JButton("Select file");
    JButton saveBtn=new JButton("Save file");
    
    
    FileChooser(){
        selectBtn.setFocusable(false);
        saveBtn.setFocusable(false);
        selectBtn.addActionListener(this);
        saveBtn.addActionListener(this);
        this.setSize(420,420);
        this.add(selectBtn);
        this.add(saveBtn);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout((int)LEFT_ALIGNMENT));
        this.setVisible(true);
    }
    
    
    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==selectBtn){
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int x=fileChooser.showOpenDialog(null);
            if(x==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
        if(e.getSource() ==saveBtn){
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int x=fileChooser.showSaveDialog(null);
            if(x==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    
}
