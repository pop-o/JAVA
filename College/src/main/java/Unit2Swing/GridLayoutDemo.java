/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2Swing;
/*
Places the content in form of row and column
i.e. like table format
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GridL extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JTextArea t1;
    public void setGrid(){
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        t1=new JTextArea(10,10);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(t1);
        
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setLayout(new GridLayout(3,2));
    }
    
    
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        GridL g=new GridL();
        g.setGrid();
    }
}
