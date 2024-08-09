/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2Swing;

/**
 *
 * @author HP
 */
/*
here we can specify where a conten can be placed and also merged two or more cell. two class are involved: GridBag 
and GridBagConstraint (used for setting layout of content).
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GridBagg extends JFrame{
    JButton b1,b2,b3;
    public void setGridB(){
       b1=new JButton("BTN 1");
       b2=new JButton("BTN 2");
       b3=new JButton("BTN 3");
        
        //creating obejct of gridbag and contraint
       GridBagLayout gb=new GridBagLayout();
       GridBagConstraints gbc=new GridBagConstraints();
     
       setVisible(true);
       setDefaultCloseOperation(3);
       setSize(500,500);
       setLayout(gb);
       
       //setting layout of b1
       gbc.gridx=0;
       gbc.gridy=0;
       //put b1 horizontally
       gbc.fill=GridBagConstraints.HORIZONTAL;
       add(b1,gbc);
       
       //for b2
       gbc.gridx=1;
       gbc.gridy=0;
       gbc.fill = GridBagConstraints.HORIZONTAL;
       add(b2,gbc);
       
       ///for b3 merging two cell
       gbc.gridx=0;
       gbc.gridy=1;
       gbc.gridwidth=2;//to merge two cell
       gbc.fill = GridBagConstraints.HORIZONTAL;
       add(b3,gbc);
       
       
    }
}
public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBagg g=new GridBagg();
        g.setGridB();
    }
}
