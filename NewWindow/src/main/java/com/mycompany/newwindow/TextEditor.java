/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import static java.awt.FlowLayout.CENTER;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class TextEditor extends JFrame implements ActionListener{
File file=null;
    JButton open;
    JButton read;
    JButton edit;
    JButton create;
    JPanel panel;
    JLabel label;
    JLabel text;
        
    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(400,420);
        panel=new JPanel();
        text=new JLabel("Here:");
        
        open=new JButton("Open file");
        read=new JButton("Read file");
        edit=new JButton("Edit file");
        create=new JButton("Create file");
        
        open.setFocusable(false);
        read.setFocusable(false);
        edit.setFocusable(false);
        create.setFocusable(false);
        
        
        panel.setPreferredSize(new Dimension(390,30));
        panel.setBackground(Color.CYAN);
        panel.setVisible(true);
        panel.setLayout(new FlowLayout((int)LEFT_ALIGNMENT));
        panel.setOpaque(true);
        label =new JLabel("Current file: ");
        
        
        
        open.addActionListener(this);
        read.addActionListener(this);
        edit.addActionListener(this);
        create.addActionListener(this);
        
        panel.add(label);
        this.add(panel);
        this.add(open);
        this.add(read);
        this.add(edit);
        this.add(create);
        this.add(text);
        
//        this.pack();
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        //open button
        if(e.getSource()==open){
            file=openfile();
            
        }
        
        
        //read button
        if(e.getSource()==read){
            if(file==null){//if no file is opened, open  file
                file=openfile();
            }
                try {
                //read already open file
                FileReader fileReader=new FileReader(file);
                int x=fileReader.read();
                    String content="";
                while(x!=-1){
                    Character a=(char)x;
                    content+=a;
                    x=fileReader.read();
                }
                text.setText(content);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                }catch(IOException ex){
                    System.out.println(ex);
                }
            
        }
        
        
        //edit button
        if(e.getSource()==edit){
            if(file==null){
                openfile();
            }
            TextArea textArea=new TextArea();
            textArea.setPreferredSize(new Dimension(200,200));
            this.add(textArea);
            JButton add=new JButton("Add");
            this.add(add);
            
        }
        
        
        //create button
        if(e.getSource()==create){
            JFrame frame=new JFrame();
            frame.setLayout(new FlowLayout((int)LEFT_ALIGNMENT));
            JTextField textField=new JTextField("Enter file name:");
            JButton submit=new JButton("Submit");
            String name;
            submit.addActionListener(this);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(submit);
            frame.add(textField);
            frame.pack();
            frame.setVisible(true);
            try {
                FileWriter fileWriter=new FileWriter("");
                
            } catch (IOException ex) {
                System.out.println(ex);
            }
            
        }
        
        
        
        
        
        
    }
    public File openfile(){
        File file = null;
        
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\HP\\Desktop"));
            int response=fileChooser.showOpenDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                file=new File(fileChooser.getSelectedFile().getAbsolutePath());
            
            }
            label.setText("Current file: "+file);
            return file;
        }
    
    public String readfile(){
       String content="";
        try {
                //read already open file
                FileReader fileReader=new FileReader(file);
                int x=fileReader.read();
                    
                while(x!=-1){
                    Character a=(char)x;
                    content+=a;
                    x=fileReader.read();
                }
                text.setText(content);
                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                }catch(IOException ex){
                    System.out.println(ex);
                }
        return content;
    }
}
