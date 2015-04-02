package decorate;

public abstract class Enchanting implements Weapon{
	protected Weapon mWeapon;
	public Enchanting(Weapon weapon) {
		this.mWeapon = weapon;
	}
}
