/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class Menu extends JFrame implements ActionListener{
    
    JMenuBar menuBar;
    JMenu file;
    JMenu edit;
    JMenu view;
    JMenuItem newfile;
    JMenuItem savefile;
    JMenuItem exit;
    
    Menu(){
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout((int)LEFT_ALIGNMENT));
        menuBar = new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        view=new JMenu("View");
        newfile=new JMenuItem("New File");
        savefile=new JMenuItem("Save File");
        exit=new JMenuItem("Exit");
        
        
        //shortchut press Alt+key
        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_E); 
        view.setMnemonic(KeyEvent.VK_V);
        //shortuct press key
        newfile.setMnemonic(KeyEvent.VK_N);
        savefile.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_X);
        
        newfile.addActionListener(e->System.out.println("New file Created"));
        savefile.addActionListener(e->System.out.println("File Saved"));
        exit.addActionListener(e->System.exit(0));
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        
        file.add(newfile);
        file.add(savefile);
        file.add(exit);
        
        
        
        
        this.add(menuBar);
        this.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
