package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherHandler implements InvocationHandler{

	private User mUser;
	public OtherHandler(User user) {
		this.mUser = user; 
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().startsWith("get")){
			return method.invoke(mUser, args);
		}
		throw new IllegalAccessException("You can't modify other's profile");
	}

}
