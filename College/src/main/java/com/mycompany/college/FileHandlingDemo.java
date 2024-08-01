package com.mycompany.college;
/*
In  java file is created by creating object of File class. It is inside package java.io.*;
data are passed to and from file stream.
stram is considered as sequence of byte
there are two ways to pass data to and from file :
1. Byte stream: here data are changed into byte then transfer into file. two classes are used 
a. FileOutputStream: to write to file using bytestream
b. FileInputStrem: to read file using bytestream

2. Character stream: here data are changed into unicode then transfer into file. two lasses are used
a. FileWriter: to write into file using character stream
b. FileReader: to read from file using character stream

*/
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileHandlingDemo {
    public static void main(String[] args) {
            try {
                File f1=new File("csit.txt");
                    if(!f1.exists()){
                f1.createNewFile();
            }else{
                        System.out.println("File already exists");
                    }
                    //file peoperties
                    System.out.println("does file exists: "+ f1.exists());
                    System.out.println("Path of file is: "+f1.getPath());
                    System.out.println("Path of file is: "+f1.getAbsolutePath());
                    System.out.println("File size is: "+f1.getFreeSpace());
                    System.out.println("Directory or nor? "+f1.isDirectory());
                    System.out.println("---------reading and writing to file using byte stream-----------");
                    //write to file
                    FileOutputStream fos=new FileOutputStream(f1);
                    String str="This is file handling";
                    //change into byte
                    byte[] data=str.getBytes();
                    fos.write(data); //write into file
                    fos.close();
                    
                    
                    //reading from file using byte stream
                    FileInputStream fis = new FileInputStream(f1);
                    int i=0;
                    while((i=fis.read())!=-1){
                        System.out.print((char)i);//cast into character
            }
                    
                    
            }catch (IOException ex) {
                System.out.println(ex);
        }
    }
}
