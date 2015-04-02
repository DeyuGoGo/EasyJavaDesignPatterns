package decorate;

import strategy.Monster;
import strategy.Slime;
import strategy.StrangeStone;
import util.JavaLog;

public class Go {
	public static void main(String[] args) {
		Weapon w1 = new Arrow();
		Weapon w2 = new Sword();
		Monster m1 = new Slime();
		Monster m2 = new StrangeStone();
//		���]�e
		attack(w1, m1);
		attack(w2, m1);
		attack(w1, m2);
		attack(w2, m2);
		w1 = new Ice(w1);
		w2 = new Fire(w2);
//		���]��
		attack(w1, m1);
		attack(w2, m1);
		attack(w1, m2);
		attack(w2, m2);
//		�������]
		w1 = new Fire(w1);
		w2 = new Fire(w2);
		attack(w1, m1);
		attack(w2, m1);
		attack(w1, m2);
		attack(w2, m2);
	}
	
	private static void attack(Weapon w ,Monster m){
		JavaLog.d(w.getHurtVerb() + "�� " + m.getName() + "�y���F"  + w.makeDamage() + "�ˮ`�C");
	}
}
