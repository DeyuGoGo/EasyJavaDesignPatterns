package decorate;

public class Fire extends Enchanting{
	
	public Fire(Weapon weapon) {
		super(weapon);
	}

	@Override
	public int makeDamage() {
		return 3 + mWeapon.makeDamage();
	}

	@Override
	public String getHurtVerb() {
		return "¨`¼öªº" + mWeapon.getHurtVerb();
	}
	
}
