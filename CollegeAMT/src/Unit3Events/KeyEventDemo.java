/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3Events;

/*
generated when key is typed, pressed and release
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Keys extends JFrame{
    JLabel l1;
    JTextArea t1;
    public void setKeys(){
        l1=new JLabel("Result");
        t1=new JTextArea(20,20);
        
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent k){
                //wehn key are continously pressed
                l1.setText("key typed");
            }
            @Override
            public void keyPressed(KeyEvent k){
                //wehn ctrl button of keyboard are pressed
                l1.setText("key pressed");
            }
            @Override
            public void keyReleased(KeyEvent k){
                //wehn key are pressed and released
                l1.setText("key realeased");
            }
        });
        add(t1);
        add(l1);
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setLayout(new FlowLayout());
    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        Keys keys=new Keys();
        keys.setKeys();
    }
}
