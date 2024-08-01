
package com.mycompany.unit2swing;

/*
Swing contains different class of GUI component that helps to develop GUI and desktop application
it uses some features of awt so following package are required
javax.swing.*;->swing component
java.awt.*;-.awt component
java.awt.event.*;->event handling
top level container is JFrame which stores all the swing controls and shows as a window

*/


import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

class Forms extends JFrame implements ActionListener{
    
    //create reference of swing component
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    
    JButton b1;
    //create object of each controls
    public void setForms(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Repassword");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Country");
        l7=new JLabel("Result");
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2=new JPasswordField(20);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        //for radio button it should be add on button group
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        c1=new JCheckBox("C");
        c2=new JCheckBox("C++");
        c3=new JCheckBox("Java");
        
        //for combobox item should be added
        String[] item={"Nepal","USA","Japan","Other"};
        cb1=new JComboBox(item);
        
        b1=new JButton("Submit");
        //adding component into window
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(l6);add(cb1);
        add(b1);add(l7);
        
        
        //setting properties of window
        setVisible(true);
        setSize(400,400);
        //to show components in particular format
        setLayout(new FlowLayout());
        //to end the program if window is close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //when button is pressed one event in generated known as action event
        //to handle event listener is used
        //for action event action listener is used 
        //listener is an interface so we have to handle all method defined under that interface
        //for actionlistener there is one method 
        //action performed which should be used to handle action event
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //extract all the form field
                String uname=t1.getText();
                String pass=p1.getText();
                String repass=p2.getText();
                String gender="";
                if(r1.isSelected()){
                    gender=r1.getText();
                } else{
                    gender=r2.getText();
                }
                String course="";
                if(c1.isSelected()){
                    course+=c1.getText();
                }
                if(c2.isSelected()){
                    course+=c2.getText();
                }
                if(c3.isSelected()){
                    course+=c3.getText();
                }
                //combobox here
                String country="";
                if(cb1.getSelectedItem()!=null){
                    country=(String)cb1.getSelectedItem();
                }
                l7.setText("Username is: "+uname+
                        "\nPassword is: "+pass+
                        "\nRepass is: "+repass+
                        "\nGender is: "+gender+
                        "\nCourse is: "+course+
                        "\nCOuntry is: "+country
                );
                
                //putting data of form into file
                try {
                    File f1=new File("Ss.txt");
                    if(!f1.exists()){
                        
                    f1.createNewFile();
                    }
                    FileWriter fw=new FileWriter(f1);
                    String data="Username is: "+uname+
                        "\nPassword is: "+pass+
                        "\nRepass is: "+repass+
                        "\nGender is: "+gender+
                        "\nCourse is: "+course+
                        "\nCOuntry is: "+country;
                    fw.write(data);
                    fw.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        });
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

  
    

}

public class SwingDemo {
    public static void main(String[] args) {
        Forms form=new Forms();
        form.setForms();
    }
}
