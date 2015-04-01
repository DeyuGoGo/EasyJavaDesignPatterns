package strategy;

public class StrangeStone extends Monster{
	
	public StrangeStone(){
		moveBehavior = new NoRun();
	}
	public StrangeStone(MoveBehavior moveBehavior){
		this.moveBehavior = moveBehavior;
	}
}
