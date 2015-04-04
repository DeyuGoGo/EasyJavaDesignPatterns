package singleton;

import util.JavaLog;

public class UserIdentification {
	
	private long UserId;
	private long password;
	private String UserName;
	
	private volatile static UserIdentification uniqueUserIdentification;

	private UserIdentification(){
		
	}
	public static UserIdentification getUserIdentification(){
		if(uniqueUserIdentification!=null){
			JavaLog.d("Get already create instance");
			return uniqueUserIdentification;
		}
		synchronized (UserIdentification.class) {
			if(uniqueUserIdentification==null){
				JavaLog.d("No Instance , create a new one");
				uniqueUserIdentification = new UserIdentification();
			}
		}
		return uniqueUserIdentification;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long userId) {
		UserId = userId;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
}
