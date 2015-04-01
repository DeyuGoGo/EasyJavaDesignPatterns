package test;

import org.junit.Test;

import strategy.NoRun;
import strategy.Slime;

public class SlimeTest {
	
	private Slime mSlime = new Slime();
	@Test
	public void testMove() {
		mSlime.move();
		mSlime.setMoveBehavior(new NoRun());
		mSlime.move();
	}
}
