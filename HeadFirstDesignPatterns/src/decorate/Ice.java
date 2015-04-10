package decorate;

import prototype.ThrowingObjects;

public class Ice extends Enchanting{

	public Ice(Weapon weapon) {
		super(weapon);
	}
	public Ice(ThrowingObjects throwingobjects){
		super(throwingobjects);
	}

	@Override
	public int makeDamage() {
		return mWeapon.makeDamage() + 2;
	}

	@Override
	public String getHurtVerb() {
		return "�H�N��" + mWeapon.getHurtVerb();
	}

	@Override
	public String ThrowOutWord() {
		return "�H�N��" + mThrowingObjects.ThrowOutWord();
	}

}
