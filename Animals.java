import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animals extends Remote {
    public String getNom() throws RemoteException;
    public String getNomMaitre() throws RemoteException;
    public String getEspece() throws RemoteException;
    public String getRace() throws RemoteException;
    public String getDescription() throws RemoteException;
}
