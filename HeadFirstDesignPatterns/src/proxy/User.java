package proxy;

import proxy.exception.UserInfoException;

public interface User {
	public void setName(String name)throws UserInfoException;
	public String getName();
	public void setPassword(String passowrd)throws UserInfoException;
	public String getPassword();
}
