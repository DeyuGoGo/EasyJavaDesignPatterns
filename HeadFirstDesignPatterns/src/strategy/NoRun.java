package strategy;

import java.util.logging.Logger;

import tuil.JavaLog;

public class NoRun implements MoveBehavior{

	@Override
	public void move() {
		JavaLog.d("No Run");
	}

	
}
