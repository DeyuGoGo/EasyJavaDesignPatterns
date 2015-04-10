package prototype;

public class Go {
	
	public static void main(String[] args) {
		Thrower t1 = new Ballista();
		Thrower t2 = new Catapults();
		t1.prepare();
		t2.prepare();
		t1.Throw();
		t2.Throw();
		
	}
}
