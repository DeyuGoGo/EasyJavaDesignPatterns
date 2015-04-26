package commnad;

import util.JavaLog;

public class DeyuScreen extends Screen{

	@Override
	public void on() {
		openPower();
		openBlueLight();
	}

	@Override
	public void off() {
		closePower();		
	}
	private void openPower(){
		JavaLog.d("openPower");
	}
	private void closePower(){
		JavaLog.d("closePower");
	}
	private void openBlueLight(){
		JavaLog.d("open low blue light");
	}
}
