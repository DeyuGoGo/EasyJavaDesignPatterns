package proxy.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LauncherServer {
	public static void main(String[] args) {
		try {
			RemoteInterface abc = (RemoteInterface)Naming.lookup("rmi://127.0.0.1/Hello");
			System.out.println(abc.Hi());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
