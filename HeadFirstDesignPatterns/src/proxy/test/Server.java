package proxy.test;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import util.JavaLog;

public class Server extends UnicastRemoteObject implements RemoteInterface{

	private static final long serialVersionUID = 1L;

	protected Server() throws RemoteException {
		super();
	}


	public static void main(String[] args) {
		try {
			RemoteInterface service = new Server();
			Naming.rebind("Hello", service);
			JavaLog.d("sadfasfd");
		} catch (Exception e) {
			JavaLog.d("sadfasfd:" + e);
		}
	}
	

	@Override
	public String Hi() {
		return "Hello,Deyu";
	}
	

	
}
