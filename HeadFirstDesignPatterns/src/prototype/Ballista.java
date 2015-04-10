package prototype;

import util.JavaLog;

public class Ballista extends Thrower{

	
	public Ballista() {
		super(new GiantCrossbow());
	}
	
//	由這個類別決定要做什麼，這邊要做的是準備好弓弩，準備的使用在父類別。
	@Override
	protected void setupThrowingObject() {
		setupCrossbow();
	}
	
	private void setupCrossbow(){
		JavaLog.d("將巨型弩箭安裝至定位");
	}

//	取消火附魔
	@Override
	public boolean hasfire() {
		return false;
	}
	
}
