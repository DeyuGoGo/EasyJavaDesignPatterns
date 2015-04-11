package iterator;

import java.util.ArrayList;

import decorate.Sword;
import decorate.Weapon;

public class WeaponStoreSW implements WeaponStore{

	private ArrayList<Weapon> mWeapons ;
	public WeaponStoreSW(){
		mWeapons = new  ArrayList<Weapon>();
		addWeapon(new Sword());
		addWeapon(new Sword());
		addWeapon(new Sword());
	}
	@Override
	public Iterator createWeaponIterator() {
		return new ArrayListWeaponIterator(mWeapons);
	}
	public void addWeapon(Weapon weapon){
		mWeapons.add(weapon);
	}
}
