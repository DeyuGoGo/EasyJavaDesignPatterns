package decorate;

import prototype.ThrowingObjects;

public class Fire extends Enchanting{
	
	public Fire(Weapon weapon) {
		super(weapon);
	}
	public Fire(ThrowingObjects throwingobjects){
		super(throwingobjects);
	}
	

	@Override
	public int makeDamage() {
		return 3 + mWeapon.makeDamage();
	}

	@Override
	public String getHurtVerb() {
		return "�`����" + mWeapon.getHurtVerb();
	}

	@Override
	public String ThrowOutWord() {
		return "�`����" + mThrowingObjects.ThrowOutWord();
	}
	
	
}
