package commnad;

import util.Animal;
import util.Deyu;

public class Go {
	public static void main(String[] args) {
		CommandController mCommandController = new CommandController();
		Animal mAnimal = new Deyu();
		Screen mScreen = new DeyuScreen();
//		Default no commnad
		mCommandController.onGetOnCommnad(0);
		mCommandController.onGetOffCommnad(1);
		mCommandController.onGetUndoCommand();
//		Set command to slot
		Command mAnimalWakeUpCommnad = new AnimalWakeUpCommnad(mAnimal);
		Command mScreenOnCommnad = new ScreenOnCommnad(mScreen);
		Command mAnimalSleepCommnad = new AnimalSleepCommand(mAnimal);
		Command mScreenOffCommnad = new ScreenOffCommnad(mScreen);
		mCommandController.setCommnad(0, mAnimalWakeUpCommnad , mAnimalSleepCommnad);
		mCommandController.setCommnad(1, mScreenOnCommnad , mScreenOffCommnad);
		mCommandController.onGetOnCommnad(0);
		mCommandController.onGetOffCommnad(1);
		mCommandController.onGetUndoCommand();
//		Set slot 0 to MacroCommand
		MacroCommand UpToLookScreanCommand = new MacroCommand(new Command[]{mAnimalWakeUpCommnad ,mScreenOnCommnad});
		MacroCommand InNightSleepCommand = new MacroCommand(new Command[]{mAnimalSleepCommnad , mScreenOffCommnad});
		mCommandController.setCommnad(0, UpToLookScreanCommand, InNightSleepCommand);
		mCommandController.onGetOnCommnad(0);
		mCommandController.onGetOffCommnad(0);

		
		
	}
}
