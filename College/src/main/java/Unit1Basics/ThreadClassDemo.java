package Unit1Basics;
//implements using thread class
class Calculate1 extends Thread{
    //it contains run methid which should be compulsory used
    @Override
    public void run(){
        try {
            //displaying even number from 1 to 10
            //in interval of 1 sec
            for (int i = 0; i <= 10; i++) {
                if(i%2==0){
                    System.out.println("T1 "+i);
                    Thread.sleep(1000);//1 sec
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Calculate2 extends Thread{
    @Override
    public void run(){
        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println("T2: "+i);
                Thread.sleep(1500);//1.5 sec
            }
                    
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        Calculate1 c1=new Calculate1();
        Calculate2 c2=new Calculate2();
        //Multithreading demo using Thread class
        //to run thread
        c1.start();
        c2.start();
        
        
    }
}
