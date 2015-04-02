package decorate;

public class Arrow implements Weapon{

	@Override
	public int makeDamage() {
		return 1;
	}

	@Override
	public String getHurtVerb() {
		return "箭，直直地射進對手身體";
	}

}
