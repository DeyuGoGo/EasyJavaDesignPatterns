package decorate;

import prototype.ThrowingObjects;

public abstract class Enchanting implements Weapon , ThrowingObjects{
	protected Weapon mWeapon;
	protected ThrowingObjects mThrowingObjects;
	public Enchanting(Weapon weapon) {
		this.mWeapon = weapon;
	}
	public Enchanting(ThrowingObjects throwingobjects){
		this.mThrowingObjects = throwingobjects;
	}
}
