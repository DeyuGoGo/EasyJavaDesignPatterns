package iterator;

import java.util.ArrayList;

import decorate.Weapon;

public class ArrayListWeaponIterator implements Iterator{
	private int position = 0 ;
	private ArrayList<Weapon>  mWeapons;
	public ArrayListWeaponIterator(ArrayList<Weapon> weapons){
		this.mWeapons = weapons;
	}
	@Override
	public boolean hasNext() {
		if(position >= mWeapons.size() || mWeapons.get(position) == null)return false;
		else return true;
	}

	@Override
	public Object next() {
		Weapon weapon = mWeapons.get(position);
		position++;
		return weapon;
	}

}
