package commnad;

import util.Animal;

public class AnimalSleepCommand implements Command{
	
	private Animal mAnimal ;
	public AnimalSleepCommand(Animal animal) {
		this.mAnimal = animal; 
	}
	@Override
	public void excute() {
		mAnimal.Sleep();
	}
	@Override
	public void undo() {
		mAnimal.WakeUp();
	}
	

}
