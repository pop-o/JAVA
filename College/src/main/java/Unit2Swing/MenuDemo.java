package Unit2Swing;
/*
Menubar is a tab that conatians sequence of item 
known as menu and menu in turn contains list of item that can be slected known as menu item
1. create menu bar
2. create memu and menu item for each menu
3. add menu into menu, menu into menubar
4. menu bar into JFrame

*/
import javax.swing.*;
import java.awt.*;
class Menus extends JFrame{
    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    public void setMenu(){
        mb=new JMenuBar();
        m1=new JMenu("File");
        //shortcut -> mnemonic
        m1.setMnemonic('f');
        JMenuItem mi1=new JMenuItem("Open",'o');
        JMenuItem mi2=new JMenuItem("Save",'s');
        JMenuItem mi3=new JMenuItem("Save as",'d');
        //adding menu item into menu
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        
        //add menu into menu bar
        mb.add(m1);
        
        //creating sub menu item and adding into m1
        m2=new JMenu("New");
        m2.setMnemonic('n');
        JMenuItem n1=new JMenuItem("new 1",'z');
        JMenuItem n2=new JMenuItem("new 1",'x');
        JMenuItem n3=new JMenuItem("new 1",'y');
        m2.add(n1);
        m2.add(n2);
        m2.add(n3);
        //adding m2 into m1 for creating submenu
        m1.add(m2);
        
        //adding radio button item into m3
        m3= new JMenu("Edit");
        JRadioButtonMenuItem r1=new JRadioButtonMenuItem("Copy");
        JRadioButtonMenuItem r2=new JRadioButtonMenuItem("Paste");
        m3.add(r1);
        m3.add(r2);
        mb.add(m3);
        
        //creating checkBox menu item in m4
        m4=new JMenu("view");
        JCheckBoxMenuItem c1=new JCheckBoxMenuItem("zoomin");
        JCheckBoxMenuItem c2=new JCheckBoxMenuItem("zoomout");
        
        m4.add(c1);
        m4.add(c2);
        
        mb.add(m4);
        add(mb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout((int)LEFT_ALIGNMENT));
        setSize(500,500);
    }
}

public class MenuDemo {
    public static void main(String[] args) {
        Menus me=new Menus();
        me.setMenu();
    }
}
