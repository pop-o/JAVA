/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit5NetworkProgramming;

/*
//here in udp client is also refer as datagramSocket
 */
import java.io.IOException;
import java.util.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            //creating socket for carrying data
            DatagramSocket ds=new DatagramSocket();
            InetAddress ip=InetAddress.getLocalHost();
            byte buff[]=null;
            //accept input till out is typed
            System.out.println("Enter any thinf you want: ");
            System.out.println("Enter out to end");
            while(true){
                String str=sc.nextLine();
                buff=str.getBytes();//extracting byte from
                //create packet for sending data
                DatagramPacket pkt=new DatagramPacket(buff,buff.length,ip,1111);
                //sending data using send()
                ds.send(pkt);
                if(str.equals("out")){
                    break;
                }
                
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
