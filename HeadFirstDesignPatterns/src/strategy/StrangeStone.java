package strategy;

public class StrangeStone extends Monster{
	
	public StrangeStone(){
		moveBehavior = new NoRun();
	}
	public StrangeStone(MoveBehavior moveBehavior){
		this.moveBehavior = moveBehavior;
	}
	@Override
	public String getName() {
		return "¥Û¹³©Ç";
	}
	
}
