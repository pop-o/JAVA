/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit8;

/*
Client makes request to server to use services
invoke the serve by using registry
 */


import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;
public class CsitBClient {
    public static void main(String[] args) throws Exception {
        //invoking server
        Registry creg=LocateRegistry.getRegistry(9009);
        //invoke service provider
        ServiceProvider sp=(ServiceProvider)creg.lookup("csitbserver");
        //service invokle
        System.out.println("--First Service--");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int res1=sp.findSum(num1, num2);
        System.out.println("Sum is"+res1);
        System.out.println("--Second Service--");
        System.out.println("Enter any number");
        int num3=sc.nextInt();
        String res2=sp.findPrime(num3);
        System.out.println(res2);
        
    }
}
