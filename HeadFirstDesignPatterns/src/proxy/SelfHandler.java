package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SelfHandler implements InvocationHandler{

	private User mUser;
	public SelfHandler(User user) {
		this.mUser = user; 
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(mUser, args);
	}

}
