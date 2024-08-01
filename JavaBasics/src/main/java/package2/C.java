/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package package2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
/**
 *
 * @author HP
 */
public class C{
     public static void main(String[] args){
//        JFrame frame=new JFrame();
//        frame.setTitle("This is frame");//set frame title
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);//prevent resize
//        frame.setSize(600,600);//x and y dimenison respectively
//        frame.setVisible(true);//make frame visible
//        frame.getContentPane().setBackground(new Color(123,25,90));//change backgorund color
//        ImageIcon image=new ImageIcon("A.png");
//        Border border=BorderFactory.createLineBorder(Color.white,6);
//        MyFrame frame=new MyFrame();
//        JLabel label=new JLabel();
//        label.setText("Helloooooo");
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER);//left center right of image
//        label.setVerticalTextPosition(JLabel.BOTTOM);//top center bottom of image
//        label.setForeground(new Color(255,255,255));//font color
//        label.setFont(new Font("MV Boli",Font.PLAIN,110));//font type
//        label.setIconTextGap(20);///set gap of text to image
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER); 
//        label.setHorizontalAlignment(JLabel.CENTER); 
//        label.setBounds(100, 100, 250, 440);
//        frame.setLayout(null);
//        frame.add(label);
//        frame.pack();
//MyFrame frame=new MyFrame();
            
            
//            JPanel[] panel=new JPanel[100];
//            int x=300,y=300,xsize=10,ysize=10;
//            for(int i=0;i<panel.length;i++){
//                panel[i]=new JPanel();
//                
//                if(i%2==0){
//                    panel[i].setBackground(Color.black);
//                }else{
//                    panel[i].setBackground(Color.white);
//                }
//                panel[i].setBounds(x,y,xsize,ysize);
//                x-=10;
//                y-=10;
//                xsize+=20;
//                ysize+=20;
//                frame.add(panel[i]);
//            }
            
//           JFrame frame=new JFrame();
//           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           frame.setSize(500,500);
//           frame.setVisible(true);
//           frame.setLayout(new BorderLayout(10,10));
//           
//           JPanel[] panel=new JPanel[5];
//           for(int i=0;i<panel.length;i++){
//               panel[i]=new JPanel();
//               panel[i].setPreferredSize(new Dimension(100,100));
////               panel[i].setBorder(BorderFactory.createLineBorder(Color.gray, 5));
//           }
//           panel[2].setVisible(false);
//           panel[0].setBackground(Color.black); 
//           panel[1].setBackground(Color.white); 
//           panel[2].setBackground(Color.red); 
//           panel[3].setBackground(Color.green); 
//           panel[4].setBackground(Color.blue); 
//           //-------subpanels
//           JPanel[] subpanel=new JPanel[5];
//            for(int i=0;i<panel.length;i++){
//               subpanel[i]=new JPanel();
//               subpanel[i].setPreferredSize(new Dimension(50,50));
////               panel[i].setBorder(BorderFactory.createLineBorder(Color.gray, 5));
//           }
//           subpanel[0].setBackground(Color.black); 
//           subpanel[1].setBackground(Color.white); 
//           subpanel[2].setBackground(Color.red); 
//           subpanel[3].setBackground(Color.green); 
//           subpanel[4].setBackground(Color.blue); 
//           
//           panel[2].setLayout(new BorderLayout(5,5));
//           panel[2].add(subpanel[0],BorderLayout.WEST);
//           panel[2].add(subpanel[1],BorderLayout.EAST);
//           panel[2].add(subpanel[2],BorderLayout.CENTER);
//           panel[2].add(subpanel[3],BorderLayout.NORTH);
//           panel[2].add(subpanel[4],BorderLayout.SOUTH);
//           //subpanels
//           
//           frame.add(panel[0],BorderLayout.WEST);
//           frame.add(panel[1],BorderLayout.EAST);
//           frame.add(panel[2],BorderLayout.CENTER);
//           frame.add(panel[3],BorderLayout.NORTH);
//           frame.add(panel[4],BorderLayout.SOUTH);
//           JButton btn=new JButton();
//           btn.setBounds(100,10,100,50);
//           btn.setText("add panel inside panel");
//           btn.setVisible(true);
//           btn.setFocusable(false);
//           btn.addActionListener(e -> panel[2].setVisible(true));
//           btn.addActionListener(e -> btn.setVisible(false));
//           
//           panel[3].add(btn);
           
//            JFrame frame =new JFrame();
//            frame.setSize(500,500);
//            frame.setVisible(true);
//            frame.setTitle("Flow layout");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           
//            frame.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));
//            
//            JPanel[] panel=new JPanel[3];
//            for(int i=0;i<panel.length;i++){
//                panel[i]=new JPanel();
//            panel[i].setPreferredSize(new Dimension(50,600));
//            panel[i].setVisible(true);
//            
//            }
//            panel[0].setBackground(Color.black);
//            panel[1].setBackground(Color.red);
//            panel[2].setBackground(Color.green);
//            
//            
//            panel[2].setLayout(new FlowLayout());
//            
//            panel[2].add(new JButton("1"));
//            panel[2].add(new JButton("2"));
//            panel[2].add(new JButton("3"));
//            panel[2].add(new JButton("4"));
//            panel[2].add(new JButton("5"));
//            panel[2].add(new JButton("6"));
//            panel[2].add(new JButton("7"));
//            
//            for(int i=0;i<panel.length;i++){
//                
//            frame.add(panel[i]);
//            }
//            JFrame frame=new JFrame();
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(500,500);
//            frame.setVisible(true);
//            frame.setLayout(new GridLayout(2,2,10,10));
//            for(Integer i=0;i<=40;i++){
//                frame.add(new JButton(i.toString()));
//            }

            JLayeredPane layeredPane=new JLayeredPane();
            layeredPane.setBounds(0,0,500,500);
            layeredPane.setBackground(Color.red);
            layeredPane.setOpaque(true);
            JPanel panel=new JPanel();
            panel.setOpaque(true);
            panel.setBounds(50,50,100,100);
            panel.setBackground(Color.black);
            JPanel panel1=new JPanel();
            panel1.setOpaque(true);
            panel1.setBounds(100,100,100,100);
            panel1.setBackground(Color.blue);
            
            
            layeredPane.add(panel,Integer.valueOf(1));
            layeredPane.add(panel1,Integer.valueOf(2));
            JFrame frame=new JFrame("Jlayered pane");
            
            frame.add(layeredPane);
            frame.setVisible(true);
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            
    }
     
}
