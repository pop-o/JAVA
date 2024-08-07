/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3Events;

/*
generated when window is working, closed, opened, minimized, back to normal, activated, deactivated
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowDemo{
    JFrame f1;
    public void setWindow(){
        f1=new JFrame();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(3);
        JButton b1=new JButton("exit");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                f1.dispose();
            }
        });
        
        //handling event on frame
        f1.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //when window is closed without using tab
                System.out.println("window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                //when windoew is closed using tab
                System.out.println("window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //minimize
                System.out.println("winodw minimize (Iconify)");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //window back to normal after minimize
                System.out.println("window maximized (deiconify)");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //when winodw working
                System.out.println("window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //when window not working
                System.out.println("window deactivated");
            }
            
        });
}
} 

public class WindowEventDemo {
    public static void main(String[] args) {
        WindowDemo win=new WindowDemo();
        win.setWindow();
    }
    
}
