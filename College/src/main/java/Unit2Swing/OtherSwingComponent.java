/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;


/**
1. splitPane: divide the content into two part with slider in middle to create split pane object of JSplitPane is created
2. JTable: show the data in form if row and column to create table its object is created and parameter accepting data and column of table\
3. JList: same as combo box bit it shows item directly .create object of JList and pass array of item as parameter , to create scroll bar, add scrollpane
 */
class OtherEg extends JFrame{
    JTextField t1;
    JComboBox cb1;
    JSplitPane sp1;
    JTable tb1;
    JButton color,color2,dial,pop;
     public void setOther(){
        t1=new JTextField(20);
        String[] data={"java","c","c++"};
        cb1=new JComboBox(data);
        //addig t1 and cb1 in split pane
        //it needs separate window for each component
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        p1.add(cb1);
        p2.add(t1);
        sp1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        //to expand and merge slider when touched
        sp1.setOneTouchExpandable(true);
        //gap between content and slider
        sp1.setDividerSize(20);
        
        add(sp1);
        
        //for JTable: need column and data
        String[] col={"id","name","faculty"};
        String [][] data1={{"1","ram","csit"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                ,{"2","Poem","CIST"}
                ,{"3","Popo","BCA"}
                ,{"4","Pom","bba"}
                ,{"5","emop","iST"}
                ,{"6","meop","CIST"}
                };
        //creating table
        tb1=new JTable(data1,col);
        tb1.setPreferredScrollableViewportSize(new Dimension(100,100));
        //adding scrollbar in table
        JScrollPane sp=new JScrollPane(tb1);
        add(sp); // adding scrollbar to window
        String[] items={"bim","csit","bba","bpt","bca","cdsfsit","bbsdfa","bpsdhrt","bcasasdfa"};
        JList ls1=new JList(items);
        JScrollPane sp1=new JScrollPane(ls1);
        add(sp1);
        JTextField tf1=new JTextField(20);
        JTextField tf2=new JTextField(20);
        //when item in list is clicked it will generate listselection event
        ls1.setSelectionMode(2);//multi select
        ls1.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent l) {
                //extracting selected value
                ArrayList<String> ar1=(ArrayList)ls1.getSelectedValuesList();
                //displaying the data
                String ans="You selected: ";
                for(String data:ar1){
                    ans+=data + " ";
                }
                tf1.setText(ans);
            }
            
        });
        add(tf1);
        color=new JButton("Color Chooser Button");
        color2=new JButton("Color Chooser Button");
        color.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JColorChooser cc=new JColorChooser();
               Color color=JColorChooser.showDialog(null, "Choose a color", Color.yellow);
               tf1.setBackground(color);
           }
        });
        
        
        add(color);
        dial=new JButton("open dialog box");
        dial.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JDialog dia=new JDialog();
               dia.add(tf2);
               dia.add(color2);
               dia.setLayout(new GridLayout(2,1));
               dia.setVisible(true);
               dia.setSize(400,400);
               dia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
           }
        });
        
        add(dial);
        pop=new JButton("Popup");
        pop.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JPopupMenu mm=new JPopupMenu("Popup menu");
                JLabel label=new JLabel("hello");
                mm.add(label);
                
                JMenuItem m1=new JMenuItem("item1");
                m1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        tf1.setText("Item1 clicked");
                    }
                });
                JMenuItem m2=new JMenuItem("item2");
                m2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        tf1.setText("Second item clicked");
                    }
                });
                JMenuItem m3=new JMenuItem("item3");
                m3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        tf1.setText("Clicked Item Third");
                    }
                });
                mm.add(m1);
                mm.add(m2);
                mm.add(m3);
                mm.show(null,pop.getX(),pop.getY());
                
                
            }
        });
        
//        this.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                 JPopupMenu mm=new JPopupMenu("Popup menu");
////                JLabel label=new JLabel("hello");
////                mm.add(label);
//                
//                JMenuItem m1=new JMenuItem("item1");
//                m1.addActionListener(new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e){
//                        tf1.setText("Item1 clicked");
//                    }
//                });
//                JMenuItem m2=new JMenuItem("item2");
//                m2.addActionListener(new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e){
//                        tf1.setText("Second item clicked");
//                    }
//                });
//                JMenuItem m3=new JMenuItem("item3");
//                m3.addActionListener(new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e){
//                        tf1.setText("Clicked Item Third");
//                    }
//                });
//                mm.add(m1);
//                mm.add(m2);
//                mm.add(m3);
//                mm.show(null,e.getX(),e.getY());
//            }
//
//            
//        });
        add(pop);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setSize(500,500);
        
    }
}

public class OtherSwingComponent {
    public static void main(String[] args) {
        OtherEg other=new OtherEg();
        other.setOther();
        
    }
}

/*
Dialog box
Popupmenu
ColorChooser
*/