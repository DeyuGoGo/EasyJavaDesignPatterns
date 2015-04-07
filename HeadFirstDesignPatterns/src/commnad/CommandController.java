package commnad;

public class CommandController {
	private Command[] onCommnads ;
	private Command[] offCommnads ;
	private Command lastCommnad; 
	private int commadCounts = 2;
	public CommandController(){
		 onCommnads = new Command[commadCounts];
		offCommnads = new Command[commadCounts];
		for(int i = 0 ; i < commadCounts ; i++){
			onCommnads[i] = new NoCommnad();
			offCommnads[i] = new NoCommnad();
		}
		lastCommnad = new NoCommnad();
	}
	public void setCommnad(int slot , Command OnCommnad , Command offCommnad){
		onCommnads[slot] = OnCommnad;
		offCommnads[slot] = offCommnad;
	}
	public void onGetOnCommnad(int slot){
		Command findCommand = onCommnads[slot];
		findCommand.excute();
		lastCommnad =findCommand; 
	}
	public void onGetOffCommnad(int slot){
		Command findCommand = offCommnads[slot];
		findCommand.excute();
		lastCommnad = findCommand;
	}
	public void onGetUndoCommand(){
		lastCommnad.undo();
	}
}
