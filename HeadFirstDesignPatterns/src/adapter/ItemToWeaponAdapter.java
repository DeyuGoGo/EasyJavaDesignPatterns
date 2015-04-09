package adapter;

import decorate.Weapon;

public class ItemToWeaponAdapter implements Weapon{

	private Item mItem ;
	public ItemToWeaponAdapter(Item item) {
		this.mItem = item;
	}
	@Override
	public int makeDamage() {
		return 0;
	}
	@Override
	public String getHurtVerb() {
		return mItem.useWord();
	}
	
}
