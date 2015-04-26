package prototype;

import decorate.Fire;
import util.JavaLog;

public abstract class Thrower {
	
	protected ThrowingObjects mThrowingObjects;
	public Thrower(ThrowingObjects throwingobjects){
		this.mThrowingObjects = throwingobjects;
	}
	public void prepare(){
		init();
		if(hasfire()){
			mThrowingObjects = new Fire(mThrowingObjects);
		}
		setupThrowingObject();
	}
	
	private void init(){
		JavaLog.d("把發射台就定位。");
	}
//	掛鉤
	public boolean hasfire(){
	return true;	
	}
	
	protected abstract void setupThrowingObject();
	
	public void Throw(){
		JavaLog.d(mThrowingObjects.ThrowOutWord());
	}
}
