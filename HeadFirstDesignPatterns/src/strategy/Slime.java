package strategy;

public class Slime extends Monster{
	public Slime(){
		moveBehavior = new Run();
	}
	public Slime(MoveBehavior moveBehavior){
		this.moveBehavior = moveBehavior;
	}
	@Override
	public String getName() {
		return "¥vµÜ©i";
	}
	
}
