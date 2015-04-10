package prototype;

import util.JavaLog;

public class Catapults extends Thrower{

	public Catapults() {
		super(new Rock());
	}

	@Override
	protected void setupThrowingObject() {
		setupRockToThrower();
	}
	
	private void setupRockToThrower(){
		JavaLog.d("����Y�w�˦n�C");
	}

	
	

}
