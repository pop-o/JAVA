
package com.mycompany.advjavalab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Demo {
    public static void main(String[] args){
        //writing to a file using filewriter
       try{
            FileWriter file=new FileWriter("Write.txt");
            file.write("This is a new file.");
            System.out.println("Writing finished :)");
            file.close();
       }catch(IOException ex){
           System.out.println(ex);
       }
       
       //reading a file using filereader
       try{
           FileReader file=new FileReader("Write.txt");
           System.out.println("Reading file:");
           int data=file.read();
           while(data!=-1){
               System.out.print((char)data);
               data=file.read();
           }
           file.close();
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
