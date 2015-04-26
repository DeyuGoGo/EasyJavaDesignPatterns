package commnad;


public class ScreenOffCommnad  implements Command{
	private Screen mScreen ;

	public ScreenOffCommnad(Screen screen) {
		this.mScreen = screen; 
	}
	@Override
	public void excute() {
		mScreen.off();
	}
	@Override
	public void undo() {
		mScreen.on();
	}

}
