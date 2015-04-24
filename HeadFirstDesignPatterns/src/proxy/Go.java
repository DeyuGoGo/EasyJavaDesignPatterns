package proxy;

import proxy.exception.UserInfoException;
import util.JavaLog;

public class Go {
	public static void main(String[] args) {
		User user1 = new UserProxy(new GameUser("Deyu", "ooppop"));
		try {
			user1.setName("D");
		} catch (UserInfoException e) {
			e.printStackTrace();
		}
		JavaLog.d("Name : " + user1.getName());
		JavaLog.d("Password : " + user1.getPassword());
		try {
			user1.setName("YuDe");
			user1.setPassword("1");
		} catch (UserInfoException e) {
			e.printStackTrace();
		}
		JavaLog.d("Name : " + user1.getName());
		JavaLog.d("Password : " + user1.getPassword());
		
		User u2 = UserProxy.getSelfProxy(new GameUser("Huang" , "02040204")) ;
		try {
			u2.setName("O");
			u2.setPassword("aas");
			} catch (Exception e) {
				e.printStackTrace();
				}
		JavaLog.d("Name : " + u2.getName());
		JavaLog.d("Password : " + u2.getPassword());
		
		User u3 = UserProxy.getOtherProxy(new GameUser("KOKO" , "KKK4")) ;
		JavaLog.d("Name : " + u3.getName());
		JavaLog.d("Password : " + u3.getPassword());
		try {
			u3.setName("MM");
			u3.setPassword("MOMO");
			} catch (Exception e) {
				e.printStackTrace();
				}
		JavaLog.d("Name : " + u3.getName());
		JavaLog.d("Password : " + u3.getPassword());
	}
}

