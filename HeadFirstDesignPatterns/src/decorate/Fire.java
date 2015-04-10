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
		return "灼熱的" + mWeapon.getHurtVerb();
	}

	@Override
	public String ThrowOutWord() {
		return "灼熱的" + mThrowingObjects.ThrowOutWord();
	}
	
	
}
