package Unit1Basics;
//implementing using runnabele
class Calculate3 implements Runnable{
    //it contains run methid which should be compulsory used
    @Override
    public void run(){
        try {
            //displaying even number from 1 to 20
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

class Calculate4 implements Runnable{
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

public class RunnableDemo {
    public static void main(String[] args) {
        Calculate3 c1=new Calculate3();
        Calculate4 c2=new Calculate4();
        //to create thread, thread class should be used
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
        
    }
}
