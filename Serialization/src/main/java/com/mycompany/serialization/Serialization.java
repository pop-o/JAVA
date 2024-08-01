/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serialization;
import java.io.*;
/**
 *
 * @author HP
 */


/*
steps to serialize
1. object class should implement serializable interface
2. add import java.io.Serializable
3. FileOutputStream fileOut=new FileOutputStream(file path);
4. ObjectOutputStream out=new ObjectOutputStream(fileOut)
6. out.writeObject(user);
7. out.close(); fileOut.close();



*/
public class Serialization {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        User user=new User("Poem","abcd");
        File file=new File("test.txt");
        file.createNewFile();
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        user.print();
                
    }
}
