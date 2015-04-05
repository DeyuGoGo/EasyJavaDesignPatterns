package singleton;

import util.JavaLog;

public class Go {
	public static void main(String[] args) {
		UserIdentification mUserIdentification ;
		mUserIdentification = UserIdentification.getUserIdentification();
		mUserIdentification.setPassword(123456);
		mUserIdentification.setUserId(224455);
		mUserIdentification.setUserName("DEYU");
		
		UserIdentification mUserIdentification2;
		mUserIdentification2 = UserIdentification.getUserIdentification();
		JavaLog.d("UserId : " + mUserIdentification2.getUserId());
		JavaLog.d("Password : " + mUserIdentification2.getPassword());
		JavaLog.d("UserName : " + mUserIdentification2.getUserName());

	}
}
