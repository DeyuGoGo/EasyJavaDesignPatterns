package strategy;

import tuil.JavaLog;

public class Run implements MoveBehavior{

	@Override
	public void move() {
		JavaLog.d("Run");
	}

}
