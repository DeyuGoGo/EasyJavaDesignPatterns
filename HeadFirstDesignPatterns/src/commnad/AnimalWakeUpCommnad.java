package commnad;

import util.Animal;

public class AnimalWakeUpCommnad  implements Command{
	private Animal mAnimal ;

	public AnimalWakeUpCommnad(Animal animal) {
		this.mAnimal = animal; 
	}
	@Override
	public void excute() {
		mAnimal.WakeUp();
	}
	@Override
	public void undo() {
		mAnimal.Sleep();
	}
}
