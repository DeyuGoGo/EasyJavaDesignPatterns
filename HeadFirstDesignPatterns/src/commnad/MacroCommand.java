package commnad;

public class MacroCommand implements Command{
	Command[] mCommands;
	public MacroCommand(Command[]  commnads){
		mCommands = commnads;
	}
	@Override
	public void excute() {
		for(Command command : mCommands){
			command.excute();
		}
	}

	@Override
	public void undo() {
		for(Command command : mCommands){
			command.undo();
		}
	}
}
