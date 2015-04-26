package commnad;

import util.JavaLog;

public class NoCommnad implements Command{

	@Override
	public void excute() {
		JavaLog.d("No commnad to exctue");
	}

	@Override
	public void undo() {
		JavaLog.d("No commnad to undo");		
	}

}
