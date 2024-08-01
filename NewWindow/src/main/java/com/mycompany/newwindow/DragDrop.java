/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class DragDrop extends JPanel{
    
    ImageIcon icon=new ImageIcon("A.png");
    final int HEIGHT=icon.getIconHeight();
    final int WIDTH=icon.getIconWidth();
    Point imageCorner;
    Point prevPt;
    
    DragDrop(){
        imageCorner = new Point(0,0);
        ClickListener clickListener=new ClickListener();
        DragListener dragListener=new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        icon.paintIcon(this, g,(int)imageCorner.getX(),(int)imageCorner.getY());
        
    }
    
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt=e.getPoint();
            System.out.println(prevPt);
        }
    }
    
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt=e.getPoint();
            
            imageCorner.translate(
                    (int)(currentPt.getX()-prevPt.getX()),
                    (int)(currentPt.getY()-prevPt.getY())
            );
            prevPt=currentPt;
            repaint();
        }
    }
}
