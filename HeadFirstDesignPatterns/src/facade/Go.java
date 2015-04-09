package facade;

import util.JavaLog;
import adapter.Banana;
import adapter.Item;
import decorate.Arrow;
import decorate.Sword;
import decorate.Weapon;

public class Go {
	
	public static void main(String[] args) {
		Weapon w1 = new Arrow();
		Weapon w2 = new Sword();
		Item i1 = new Banana();
		ComboFacade mCF = new ComboFacade(w1, w2, i1);
		JavaLog.d(mCF.AttackAndUseItemCombo());
		JavaLog.d(mCF.TwoWeaponCombo());
	}
}
