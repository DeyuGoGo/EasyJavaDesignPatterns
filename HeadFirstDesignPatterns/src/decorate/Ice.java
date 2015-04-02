package decorate;

public class Ice extends Enchanting{

	public Ice(Weapon weapon) {
		super(weapon);
	}

	@Override
	public int makeDamage() {
		return mWeapon.makeDamage() + 2;
	}

	@Override
	public String getHurtVerb() {
		return "´H§Nªº" + mWeapon.getHurtVerb();
	}

}
