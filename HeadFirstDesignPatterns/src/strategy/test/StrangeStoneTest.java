package strategy.test;

import org.junit.Test;

import strategy.Run;
import strategy.StrangeStone;

public class StrangeStoneTest {

	private StrangeStone mStrangeStone = new StrangeStone();
	@Test
	public void testMove() {
		mStrangeStone.move();
		mStrangeStone.setMoveBehavior(new Run());
		mStrangeStone.move();
	}
}
