/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3Events;

/*
//when any action is poerformed like clicking , moving mouse, typing some event is generated. such event is 
listen by listener and provides method to handle such event. Listener is an interface which contains list of
method and all the method should be used compulsary. THis is also known as delegation
event method
button->actin event
radiobutton->action event
checkbox->item event action event
combobox->item event and action event
list->listselectionevent
Mouse event: generated when mouse is clicked, pressed, released, enter, exit
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mouse extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouse(){
        l1=new JLabel("result: ");
        t1=new JTextArea(20,20);
        
        //handling mouse event in t1
        t1.addMouseListener(new MouseListener(){
           @Override
           public void mouseClicked(MouseEvent e){
               //when mouse is clicked and released
               l1.setText("mouse clicked");
           }
           @Override
           public void mousePressed(MouseEvent e){
               //when mouse is ccontinuosuly pressed
               l1.setText("mouse pressed");
           }
           @Override
           public void mouseReleased(MouseEvent e){
               //when mouse is clicked inside component and released outside component
               l1.setText("mouse released");
           }
           @Override
           public void mouseEntered(MouseEvent e){
               //when mouse enters component
               l1.setText("mouse Enter");
           }
           @Override
           public void mouseExited(MouseEvent e){
               //when mouse exits component
               l1.setText("mouse Exit");
           }
        });
        add(l1);
        add(t1);
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setLayout(new FlowLayout());
    }
}

public class MouseEventDemo {
    public static void main(String[] args) {
        Mouse mouse=new Mouse();
    mouse.setMouse();
    }
}
