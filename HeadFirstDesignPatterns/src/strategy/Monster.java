package strategy;

public abstract class Monster {
	
	protected MoveBehavior moveBehavior;
	
	public void setMoveBehavior(MoveBehavior moveBehavior){
		this.moveBehavior = moveBehavior;
	}
	
	public void move(){
		moveBehavior.move();
	}
	public abstract String getName(); 
}
