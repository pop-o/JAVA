/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3Events;

/*
mouse motion is generated when mouse is moce and dragged
mouse wheel event is generated when wheel of mouse is moved


 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseExtra extends JFrame{
    JLabel l1;
    JTextArea t1;
    public void setExtra(){
        l1=new JLabel();
        t1=new JTextArea(20,20);
        add(l1);
        add(t1);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        
        t1.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseMoved(MouseEvent e){
                l1.setText("mouse moved"+e.getX()+" "+e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                l1.setText("mouse Dragged"+e.getX()+" "+e.getY());
            }
            
            
        });
        
        //mouse wheel event
        
        t1.addMouseWheelListener(new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                l1.setText("mouse wheel moved"+e.getX()+" "+e.getY());
            }
            
        });
        
    }
}

public class MouseMotionAndWheelDemo {
    public static void main(String[] args) {
        MouseExtra extra=new MouseExtra();
        extra.setExtra();
    }
}
