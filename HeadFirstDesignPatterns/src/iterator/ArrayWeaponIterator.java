package iterator;

import decorate.Weapon;

public class ArrayWeaponIterator implements Iterator{
	private int position = 0 ;
	private Weapon[] mWeapons;
	public ArrayWeaponIterator(Weapon[] weapons){
		this.mWeapons = weapons;
	}
	@Override
	public boolean hasNext() {
		if(position >= mWeapons.length || mWeapons[position] == null)return false;
		else return true;
	}

	@Override
	public Object next() {
		Weapon weapon = mWeapons[position];
		position++;
		return weapon;
	}

}
