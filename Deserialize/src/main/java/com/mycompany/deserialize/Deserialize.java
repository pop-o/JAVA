package com.mycompany.deserialize;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) {
        
        try {
            File file = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Serialization\\test.txt");
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user = (User) in.readObject();
            in.close();
            fileIn.close();
            user.print();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
