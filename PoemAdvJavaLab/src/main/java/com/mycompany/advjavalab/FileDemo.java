package com.mycompany.advjavalab;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("Demo.txt");
        Scanner sc=new Scanner(System.in);
        try{
            FileOutputStream fos=new FileOutputStream(file);
            System.out.println("Enter text: ");
            String txt=sc.nextLine();
            byte[] by=txt.getBytes();
            fos.write(by);
            System.out.println("Writing complete.");
            fos.close();
            
            
            FileInputStream fin=new FileInputStream(file);
            Scanner sc1=new Scanner(fin);
            System.out.println("Reading from file.");
            while(sc1.hasNextLine()){
                System.out.println(sc1.nextLine());
            }
            fin.close();
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
}

