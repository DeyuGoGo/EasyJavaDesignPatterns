package composite;


public class Go {
	public static void main(String[] args) {
//		�L�X����
		EmperorLegion el = new EmperorLegion();
		el.rollcall();
//		�L�X�M�h��
		Team t1 = el.getKnightTeam();
		t1.display();
//		��X�ĤG���M�h
		Hero h1 = (Hero)t1.getChild(1);
		h1.display();
		
	}
}
