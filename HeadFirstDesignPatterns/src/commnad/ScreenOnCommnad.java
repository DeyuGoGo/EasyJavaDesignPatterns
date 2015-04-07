package commnad;


public class ScreenOnCommnad  implements Command{
	private Screen mScreen ;

	public ScreenOnCommnad(Screen screen) {
		this.mScreen = screen; 
	}
	@Override
	public void excute() {
		mScreen.on();
	}
	@Override
	public void undo() {
		mScreen.off();
	}

}
