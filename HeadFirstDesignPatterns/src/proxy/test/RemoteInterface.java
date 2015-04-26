package proxy.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{
	public String Hi() throws RemoteException;
}
