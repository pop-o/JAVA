    package advancedJavaLab5;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class DiscountRmiServer extends UnicastRemoteObject implements DiscountRmiSP {
    public DiscountRmiServer() throws RemoteException{}
    @Override
    public int findSP(int Cp,int discount){
        return Cp-discount;
    }
    public static void main(String[] args) {
        try{
        Registry reg=LocateRegistry.createRegistry(9999);
        reg.rebind("lab5", new DiscountRmiServer());
        }catch(RemoteException ex){
            System.out.println(ex);
        }
    }
}
