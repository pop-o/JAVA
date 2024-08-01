/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author HP
 */
public class A {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        try{
            FileWriter file=new FileWriter("app.txt");
            file.write("Hello world!!!!!\nLet's goooooo");
            file.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        File file=new File("app.txt");
        if(file.exists())
        {
            System.out.println("It ecisits");
            System.out.println(file.getAbsolutePath());
        }   
        
        try{
            FileReader fl=new FileReader("app.txt");
            
            int data=fl.read();
            while(data!=-1){
                System.out.print((char)data);
                data=fl.read();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
}
