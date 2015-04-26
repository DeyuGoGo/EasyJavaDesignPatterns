package composite;

public class Commander {
	private Brave mBrave;
	public Commander(Brave brave) {
		this.mBrave = brave;
	}
	public void rollcall(){
		mBrave.display();
	}
}
