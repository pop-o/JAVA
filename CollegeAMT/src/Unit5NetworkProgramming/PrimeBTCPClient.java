
package Unit5NetworkProgramming;

import java.net.*;
import java.io.*;
public class PrimeBTCPClient {
    private Socket sc;
    private DataInputStream in;//to input data
    private DataOutputStream out;//to send data
    public PrimeBTCPClient(String address,int port){
        try{
            
        sc=new Socket(address,port);
            System.out.println("clinet ready");
            System.out.println("Send any string and press out to send");
            in=new DataInputStream(System.in);
            out=new DataOutputStream(sc.getOutputStream());
            //take input form use and send to server
            String str="";
            while(!str.equals("out")){
                str=in.readLine();//reading from console
                out.writeUTF(str);//writing to client
                out.flush();//memory flush
            }
            in.close();
            out.close();
            sc.close();
        }catch(UnknownHostException u){
            System.out.println(u);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        PrimeBTCPClient pb=new PrimeBTCPClient("localhost",9999);
    }
}
