package facade;

import adapter.Item;
import decorate.Weapon;

public class ComboFacade {
	Weapon mWeapon1;
	Weapon mWeapon2;
	Item mItem;
	
	public ComboFacade(Weapon weapon, Weapon weapon2 , Item item ) {
		this.mWeapon1 = weapon;
		this.mWeapon2 = weapon2;
		this.mItem = item;
	}
	
	public String TwoWeaponCombo(){
		return mWeapon1.getHurtVerb() + mWeapon2.getHurtVerb();
	}
	
	public String AttackAndUseItemCombo(){
		return mWeapon1.getHurtVerb() + mItem.useWord();
	}
}
