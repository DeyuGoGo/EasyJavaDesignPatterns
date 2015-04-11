package iterator;

import decorate.Arrow;
import decorate.Weapon;

public class WeaponStoreTW implements WeaponStore{

	private static final int MAX = 5;
	private Weapon[] mWeapons ;
	private int amount = 0;
	public WeaponStoreTW(){
		mWeapons = new Weapon[MAX];
		addWeapon(new Arrow());
		addWeapon(new Arrow());
		addWeapon(new Arrow());
	}
	@Override
	public Iterator createWeaponIterator() {
		return new ArrayWeaponIterator(mWeapons);
	}
	public void addWeapon(Weapon weapon){
		if(amount>=MAX) throw new IndexOutOfBoundsException("WeaponStoreTW in max weapons can't add weapon");
		mWeapons[amount] = weapon;
		amount++;
	}
}
