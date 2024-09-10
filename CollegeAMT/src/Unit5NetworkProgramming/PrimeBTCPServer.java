/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit5NetworkProgramming;

/*
network program deals with sending and receiving data from network, here client is knows as socket and server is known as serversocket. 
in udp, both client and server is treated as datagramsocket and data of UDP is known as datagram (send in byte)
step to create TCP client server
1. create server by registering port and provide service
2. create client by invoking address and port of server adn send request to server
to use network  java.net package should be imported
 */
import java.net.*;
import java.io.*;
public class PrimeBTCPServer {
    private Socket c1;//clent to connect woth server
    private ServerSocket server;
    private DataInputStream in;//to take from client 
    //create constructor to connect woth client
    public PrimeBTCPServer(int port){
        try{
            server=new ServerSocket(port);
            System.out.println("Server ready");
            System.out.println("waiting for client");
            //connecting server and client
            c1=server.accept();
            //extract data from client
            in=new DataInputStream(new BufferedInputStream(c1.getInputStream()));
            //provide intended servive
            //provide string reverse service
            String  ans="";
            //accept input until user send out
            while(!ans.equals("out")){
                ans=in.readUTF();//read string
                System.out.println("Client says: "+ans);
                System.out.println("reverse form of clinet data: ");
                String rv="";
                for(int i=0;i<ans.length();i++){
                    rv=ans.charAt(i)+rv;
                }
                System.out.println(rv);
            }
            c1.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        PrimeBTCPServer sp=new PrimeBTCPServer(9999);
        
    }
}
