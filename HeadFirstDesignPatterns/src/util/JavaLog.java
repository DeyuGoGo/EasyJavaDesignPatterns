package util;


public class JavaLog {
	
	private static final boolean isNeedD = true;
	private static final boolean isNeedE = true;
	
	public static void d(String Log){
		if(isNeedD)System.out.println(Log);
	}

}
