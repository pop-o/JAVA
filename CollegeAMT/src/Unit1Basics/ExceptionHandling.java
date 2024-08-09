/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1Basics;
import java.util.*;

/**
 *
 * @author HP
 */
//Exception is any abnormal condition that disturb normal flow of execution. if any exceptuon occur then code nelow such error will not execture/
//Exception handling is a mechanish that handle sicj exception such that other code can be execute in normal way. Exception handling contains following keywords
//try: any code section that can profuce exception is place on try block
//catch: if any error occur in try block then such excepiton shoukd be handke from catch
//throw: to explicitly throw exception
//throws: if exception can occur from methid 
//finally: code in finally bloc is always executed

public class ExceptionHandling{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        
        //divide by zero exception occurs if num2 is 0(zero)
        try{
            int div=num1/num2;
            System.out.println("Div is "+div);
            //arrayindexoutofboundsexception: if data is inserted more htna its size
            
            int[] arr=new int[3];
            arr[0]=10;
            arr[1]=110;
            arr[2]=105;
            arr[7]=112;
        }catch(ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is always executed");
        }
        System.out.println("OUT OF TRY CATCH");
    }
}
