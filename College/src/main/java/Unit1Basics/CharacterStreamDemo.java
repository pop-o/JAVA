package Unit1Basics;
import java.io.*;
import java.util.*;
public class CharacterStreamDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            File f1=new File("poem.txt");
            f1.createNewFile();
            //writing through character stream
            FileWriter fw=new FileWriter(f1);
            System.out.println("Enter a line of text");
            String data=sc.nextLine();
            fw.write(data);
            fw.close();
            
            
            //reading from file
            FileReader fr=new FileReader(f1);
            Scanner sc1=new Scanner(fr);
            if(sc1.hasNextLine()){
                System.out.println(sc1.nextLine());
            }
            fr.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
}
//college