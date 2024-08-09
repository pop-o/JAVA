//try catch inside another try catch block is nested inside try catch
//inner try catch will access outer catch if it cannot handle excepiton but reverse is not true
package Unit1Basics;
import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            
            //inner try catch here
            try {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter two numbers:");
                int num1=scan.nextInt();
                int num2=scan.nextInt();
                int div=num1/num2;
                System.out.println("Division is: "+div);
                
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
    