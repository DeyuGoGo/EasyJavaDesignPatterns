package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.exception.UserInfoException;

public class UserProxy implements User{

	private User mUser;
	public UserProxy(User user){
		this.mUser = user;
	}
//	動態代理人
	public static User getSelfProxy(User user){
		return getVProxy(user, new SelfHandler(user));
	}
	public static User getOtherProxy(User user){
		return getVProxy(user, new OtherHandler(user));
	}
	
	private static User getVProxy(User user , InvocationHandler handler){
		return (User)Proxy.newProxyInstance
				(user.getClass().getClassLoader(), 
				user.getClass().getInterfaces(), 
				handler);
	}
	@Override
	public void setName(String name) throws UserInfoException {
		if(name.length()<2) throw new UserInfoException();
		mUser.setName(name);
	}

	@Override
	public String getName() {
		return mUser.getName();
	}

	@Override
	public void setPassword(String passowrd) throws UserInfoException {
		if(passowrd.length() < 4) throw new UserInfoException();
		mUser.setPassword(passowrd);
	}

	@Override
	public String getPassword() {
		return mUser.getPassword();
	}

}
