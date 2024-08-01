
package com.mycompany.college;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
multithreading is a mechanism by which one program can do multiple work at a same time.
in java multithreading can be acheived using two ways:
1. by implementing runnable interface
2. by extending (inheriting) thread classs
One thread is always rinning when program is created 
this thread is known as main thread.
to execute thread run() method is used


*/

public class ThreadDemo {
    public static void main(String[] args) {
        //main thread
        //extracting current thread
        Thread t1=Thread.currentThread();
        t1.setName("CSIT THREAD");
        System.out.println("Name of thread is:"+t1.getName());
        System.out.println("Priority is: "+t1.getPriority() );
        t1.setPriority(2);
        System.out.println("New priority is: "+ t1.getPriority());
        System.out.println("State is: "+t1.getState());
        //suspending thread: 
        //displaying data 10 time by suspending half second
            try {
        for (int i = 0; i < 10; i++) {
                System.out.println("This is main thread "+i);
                Thread.sleep(500);
                //it will throw interupted Exception if any interruption occur between time
            }
            } catch (InterruptedException ex) {
                System.out.println(ex);
        }
    }
    
}
