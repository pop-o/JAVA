
package Unit2Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Eg extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    boolean checkprime(int num){
        int sq = (int)Math.sqrt(num);
        if(num<=1){
            return false;
        }
        for(int i=2;i<=sq;i++){
            if(num%i==0){
                return false;
            }
            
        }
        
        
       return true;
    }    
    
    public void setEg(){
        l1=new JLabel("enter first numnber");
        l2=new JLabel("Enter second number");
        l3=new JLabel("Result");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("Multiply");
        b2=new JButton("Divide");
        b3=new JButton("Generate Prime");
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(b3);
        add(l3);
        setVisible(true);
        setSize(400,400);
        //to show components in particular format
        setLayout(new FlowLayout());
        //to end the program if window is close
        setDefaultCloseOperation(3);
            
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int mul=num1*num2;
                l3.setText("multiplication is: "+mul);
            }

        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                try{
                    
                int div=num1/num2;
                l3.setText("multiplication is: "+div);
                }catch(ArithmeticException ex){
                    l2.setText("divide by zero exception");
                    System.out.println(ex);
                }
            }

        });
        //self added
        b3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               int num1=Integer.parseInt(t1.getText());
               int num2=Integer.parseInt(t2.getText());
               String prime="";
               
               if(num1<num2){
                   
               for(int i=num1;i<=num2;i++){
                   if(checkprime(i)){
                       prime+=i+" ";
                   }
               }
               }else{
                   for(int i=num2;i<=num1;i++){
                   if(checkprime(i)){
                       prime+=i+" ";
                   }
               }
               }
               l3.setText("Prime numbers are: "+prime);
             
               
           }
        });
        
    }
}

public class Example{
    public static void main(String[] args) {
        Eg abc=new Eg();
        abc.setEg();
    }
}