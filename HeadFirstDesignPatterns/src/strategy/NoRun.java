package strategy;

import util.JavaLog;

public class NoRun implements MoveBehavior{

	@Override
	public void move() {
		JavaLog.d("No Run");
	}
}
