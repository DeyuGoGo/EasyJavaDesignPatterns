package iterator;


public class Go {
	public static void main(String[] args) {
		WeaponStoreSW mStoreSW = new WeaponStoreSW();
		WeaponStoreTW mStoreTW = new WeaponStoreTW();
		ArmsSales sales = new ArmsSales(mStoreTW, mStoreSW);
		sales.FlySprayArms();
	}
}
