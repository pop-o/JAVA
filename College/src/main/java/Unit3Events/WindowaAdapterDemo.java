/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3Events;

/* 
using listerner we have to use all the method complusory
defined by it. but using adapter class we can use only specific methods 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowAd{
    public void setWindows(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        
        frame.addWindowListener(new WindowAdapter(){
            //out of 7 any can be used
            @Override
            public void windowIconified(WindowEvent e){
                System.out.println("Window minimized");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                System.out.println("Window maximized");
            }
        });
}
}

public class WindowaAdapterDemo {
    public static void main(String[] args) {
        WindowAd win=new WindowAd();
        win.setWindows();
    }
}
