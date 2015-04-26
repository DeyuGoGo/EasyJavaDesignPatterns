package util;


public class JavaLog {
	
	private static final boolean isNeedDeBug = true;
	private static final boolean isNeedError = true;
	
	public static void d(String Log){
		if(isNeedDeBug)System.out.println(Log);
	}

	public static void e(String Log){
		if(isNeedError)System.out.println(Log);
	}
}
