package decorate;

public class Sword implements Weapon {

	@Override
	public int makeDamage() {
		return 3;
	}

	@Override
	public String getHurtVerb() {
		return "刀狠狠砍了他一下";
	}
	

}
