/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit8;

/*
RMI stands dor remote method invocation in which one object can ivoke method of another object running in another JVM.
In involves threee parameter:
remote object that register services
server that invoke service provider to provide service
client that request server for services
client (stub) sends parameter to server which is known as mershalling and also request parameter from server known unmarshalling
step to create RMI application
1. create service provider (interface) that will register number of services
2. create server by registering RMI that invokes service provider to provide service
3. create client by invoking RMI registry 
to use RMI java.rmi.* package should be imported.
 */

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class CsitBServer extends UnicastRemoteObject implements ServiceProvider{
    //it throws temote excpetion
    public CsitBServer() throws RemoteException{}
    
    @Override
    public int findSum(int x,int y){
        return (x+y);
    }

    @Override
    public String findPrime(int num){
        int temp=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                temp++;
            }
        }
        if(temp==2){
            return "The number is prime";
        }else{
            return "The number is composite";
        }
    }
    public static void main(String[] args) {
        //creating server
        try{
            Registry reg=LocateRegistry.createRegistry(9009);
            //binding server
            reg.rebind("csitbserver", new CsitBServer());
        }catch(RemoteException r){
            System.out.println(r);
            
        }
    }
}
