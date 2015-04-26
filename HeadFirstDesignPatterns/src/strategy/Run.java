package strategy;

import util.JavaLog;

public class Run implements MoveBehavior{

	@Override
	public void move() {
		JavaLog.d("Run");
	}

}
