package util;

public class Deyu extends Animal{

	@Override
	public void Sleep(){
		JavaLog.d("睡覺，得瑜表示開心。");
	}
	@Override
	public void WakeUp(){
		JavaLog.d("I don't want to wake up 。");
	}
}
