package advancedJavaLab5;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class ProductRmiServer extends UnicastRemoteObject implements ProductRmiSP {
    public ProductRmiServer() throws RemoteException{};
    @Override
    public int findProduct(int x,int y){
        return x*y;
    }
    public static void main(String[] args) {
        try{
            Registry reg=LocateRegistry.createRegistry(1111);
            reg.rebind("product", new ProductRmiServer());
        }catch(RemoteException ex){
            System.out.println(ex);
        }
    }
}
