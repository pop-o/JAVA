package exam;
import java.util.*;
import java.io.*;
interface Maths{
    public int sum(int x,int y);
    
};
interface Mul{
    public int sum(int x,int y,int z);
}

interface All extends Maths,Mul{
    public int sum(int x,int y);
};

class Parent{
    private int id;
    Parent(int id){
        this.id=id;
    };
    public int getId(){
      return id;  
    };
    
}

class Child extends Parent{
    private String name;
    Child(int id,String name){
        super(id);
        this.name=name;
        
    };
    
    
    public void print(){
        
        System.out.println(getId()+this.name);
    }
}

class College implements All{
	public String checkNumber(int num){
		if(num%3==0 && num%5==0){
                    return "CSIT 1";
                }else if(num%3==0){
                    return "CSIT 7";
                }else if(num%5==0){
                    return "CSIT 5";
                }else{
                    return "Number is not divisisle by 3 or 5";
                }
                }
        
        @Override
        public int sum(int x,int y){
            return x+y;
        };
        @Override
        public int sum(int x,int y,int z){
            return x+y+z;
        }
        }

class Ser implements Serializable{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(name);
    }
}

public class Exam {
	public static void main(String[] args){
//		College col=new College();
//                int sum=col.sum(12, 213);
//                System.out.println(sum);
//                
//                Child c=new Child(1,"Poem");
//                c.print();
//                try{
//                File f1=new File("abc.txt");
//                if(!f1.exists()){
//                    f1.createNewFile();
//                }
//                FileOutputStream foos=new FileOutputStream(f1);
//                String test="This sis demo text";
//                foos.write(test.getBytes());
//                foos.close();
//FileInputStream fis=new FileInputStream(f1);
//FileOutputStream fos =new FileOutputStream("new.txt");
//
//int i=0;
//while((i=fis.read())!=-1){
//	fos.write(i);
//}
//                }catch(IOException ex){
//                    System.out.println(ex);
//                }
                    try{
//                        Ser test=new Ser();
//                        test.setName("This is my name");
//                        
//                   FileOutputStream fos=new FileOutputStream("xx.txt");
//                   ObjectOutputStream oos=new ObjectOutputStream(fos);
//                   oos.writeObject(test);
                        FileInputStream fis=new FileInputStream("xx.txt");
                        ObjectInputStream ois=new ObjectInputStream(fis);
                        Ser test1=(Ser) ois.readObject();
                        
                        test1.display();
                    }catch(IOException ex){
                        System.out.println(ex);
                    }catch(ClassNotFoundException e){System.out.println(e);}
                    
                    
                    
                    
//                Scanner sc=new Scanner(System.in);
//                System.out.println("Enter a number");
//                int num=sc.nextInt();
//                System.out.println(col.checkNumber(num));
//                int[][] arr1={
//                    {12},{11,12}
//                };
////                for(int i=0;i<arr1.length;i++){
////                    for(int j=0;j<arr1[i].length;j++){
////                        System.out.print((arr1[i][j])+" ");
////                    }
////                    System.out.println();
////                }
//                    for(int[] x:arr1){
//                        for(int y:x){
//                            System.out.print(y);
//                        }
//                        System.out.println();
//                    }

                    
                
}	
}

