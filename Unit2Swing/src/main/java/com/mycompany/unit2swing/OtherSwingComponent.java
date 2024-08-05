/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
1. splitPane: divide the content into two part with slider in middle to create split pane object of JSplitPane is created
2. JTable: show the data in form if row and column to create table its object is created and parameter accepting data and column of table
 */
class OtherEg extends JFrame{
    JTextField t1;
    JComboBox cb1;
    JSplitPane sp1;
    JTable tb1;
    public void setOther(){
        t1=new JTextField(20);
        String[] data={"java","c","c++"};
        cb1=new JComboBox(data);
        //addig t1 and cb1 in split pane
        //it needs separate window for each component
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        p1.add(cb1);
        p2.add(t1);
        sp1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        //to expand and merge slider when touched
        sp1.setOneTouchExpandable(true);
        //gap between content and slider
        sp1.setDividerSize(20);
        
        add(sp1);
        
        //for JTable: need column and data
        String[] col={"id","name","faculty"};
        String [][] data1={{"1","ram","csit"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
        };
        //creating table
        tb1=new JTable(data1,col);
        tb1.setPreferredScrollableViewportSize(new Dimension(100,100));
        //adding scrollbar in table
        JScrollPane sp=new JScrollPane(tb1);
        add(sp); // adding scrollbar to window
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
        
    }
}

public class OtherSwingComponent {
    public static void main(String[] args) {
        OtherEg other=new OtherEg();
        other.setOther();
    }
}
