package iterator;

import decorate.Weapon;
import util.JavaLog;

public class ArmsSales {

	private WeaponStoreTW mStoreTW ;
	private WeaponStoreSW mStoreSW ;
	public ArmsSales(WeaponStoreTW storeTW , WeaponStoreSW storeSW){
		this.mStoreTW = storeTW ;
		this.mStoreSW = storeSW;
	}
	
	public void FlySprayArms(){
		Iterator iterator = mStoreTW.createWeaponIterator();
		Iterator iterator2 = mStoreSW.createWeaponIterator();
		JavaLog.d("TW");
		FlySprayArms(iterator);
		JavaLog.d("SW");
		FlySprayArms(iterator2);
	}
	private void FlySprayArms(Iterator iterator){
		while(iterator.hasNext()){
			Weapon ooWeapon = (Weapon)iterator.next();
			JavaLog.d("業務的武器噴出啦" + ooWeapon.getHurtVerb());
		}
	}
}
