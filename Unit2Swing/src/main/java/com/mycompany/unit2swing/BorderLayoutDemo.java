/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2swing;
/*
Layout define how the content should be oresent in window. follow are the layout of swing:
1. flowlayout 2. Borderlayout 3.grid layout 4. gridbaglout 5. cardlayout 6. null1
BOrderLayout: places the content in term of direction: North(top) south (bottom) west(left) east(right) 
center(middle)
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Borders extends JFrame{
    JButton b1,b2,b3,b4;
    JTextArea t1;
    public void setBorders(){
        b1=new JButton("North");
        b2=new JButton("South");
        b3=new JButton("East");
        b4=new JButton("West");
        t1=new JTextArea(20,20);
        
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        setSize(500,500);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(t1,BorderLayout.CENTER);
        
        b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               t1.setText("NOrth button is clicked");
           }
        });
        b2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               t1.setText("South button is clicked");
           }
        });
        b3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               t1.setText("East button is clicked");
           }
        });
        b4.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               t1.setText("West button is clicked");
           }
        });
    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Borders bro=new Borders();
        bro.setBorders();;
    }
}
