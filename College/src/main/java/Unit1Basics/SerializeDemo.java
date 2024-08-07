/*
Serialization is the process of writing object to  a file.
for this objectOutputstream is used
reading a object from a file is knows as deserialization
to read o objectinpurstream is used
Steps
1. Create a class whose object is to be write
such class should implement serializable interface
2. open file in write mode using byte stream
3, create object of objectOutputstream and pass object of fileoutputstream as parameter
4. call method writeobject and pass object of class as parameter

*/
package Unit1Basics;
import java.io.*;


class Box implements Serializable{
    private int length;
    private int breadth;
    private int height;
    public void setBox(int length,int breadth,int height){
        this.length=length;
        this.height=height;
        this.breadth=breadth;
    }
    public void calcVol(){
        int vol=length*breadth*height;
        System.out.println("Volume is: "+vol);
    }
}
public class SerializeDemo {
    public static void main(String[] args) {
        try{
            Box box=new Box();
            box.setBox(12, 10, 8);
            //create new file
            File f1=new File("ob.txt");
//            f1.createNewFile();

            //open file in write mode
            
            FileOutputStream fos=new FileOutputStream(f1);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(box);
            //deserialize
            System.out.println("--------------Reading object from file--------");
            
            
            FileInputStream fin=new FileInputStream(f1);
            ObjectInputStream ois=new ObjectInputStream(fin);
            //when object is read then it return object class, so we have to cast such object into appropriate class
            Box b2=(Box) ois.readObject();//b2=box
            
            
            b2.calcVol();
                    
            
        }catch(IOException ex){
            //if file is not found
            System.out.println(ex);
        }catch(ClassNotFoundException ex){
            //if a class whose object is to be write is not found
            System.out.println(ex);
        }
            
        
    }
}
