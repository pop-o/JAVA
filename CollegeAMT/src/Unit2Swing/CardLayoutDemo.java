/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2Swing;

/*
places the content like sequence of card that is one after another, one content is hidden by another 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Cards extends JFrame{
    JButton b1,b2,b3;
    public void setCards(){
        b1=new JButton("Card 1");
        b2=new JButton("Card 2");
        b3=new JButton("Card 3");
        //adding conttols into sub-window panel
        JPanel p1=new JPanel();
        p1.add(b1,"but1");
        p1.add(b2,"but2");
        p1.add(b3,"but3");
        
        CardLayout c1=new CardLayout();
        //adding layout to panel
        p1.setLayout(c1);
        add(p1);
        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);
        
        //showing next card
//        c1.next(p1);
        b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               c1.show(b1, "but3");
           }
        });
    }
}

public class CardLayoutDemo {
    public static void main(String[] args) {
        Cards card=new Cards();
        card.setCards();
    }
}
