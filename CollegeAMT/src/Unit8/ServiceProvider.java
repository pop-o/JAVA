/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Unit8;

/*
the number of service to provided are registered here
 */

import java.rmi.*;
public interface ServiceProvider extends Remote{
    //first service: send two number return sum
    int findSum(int x,int y) throws Exception;
    //return whether given number is prime or not
    String findPrime(int num) throws Exception;
    
}
