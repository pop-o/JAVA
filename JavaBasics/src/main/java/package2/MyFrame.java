/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author HP
 */
public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    JPanel panel;
    MyFrame(){
        panel=new JPanel();
        panel.setBounds(100,100,200,300);
        panel.setBackground(Color.black);
        panel.setVisible(false);
        
        
        
        btn=new JButton();
        
        
        btn.setBounds(100,100,100,50);
        btn.addActionListener(this);
        btn.setText("This is a button");
        btn.setFocusable(false);
        this.setSize(500,500);
        this.setTitle("Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
        this.getContentPane().setBackground(new Color(123,50,250));
        this.setVisible(true);
        this.setLayout(null);
        this.add(btn);
        this.add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
//            System.out.println("Hello");
                panel.setVisible(true);
        }
    }
}
