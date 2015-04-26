package strategy;

import util.JavaLog;

public class Go {

	public static void main(String[] args) {
		JavaLog.d("Test Log ");
		Monster monster = new Slime();
		monster.move();
		monster = new StrangeStone();
		monster.move();
	}
	
}
