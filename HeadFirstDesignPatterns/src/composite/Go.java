package composite;


public class Go {
	public static void main(String[] args) {
//		印出全部
		EmperorLegion el = new EmperorLegion();
		el.rollcall();
//		印出騎士團
		Team t1 = el.getKnightTeam();
		t1.display();
//		找出第二個騎士
		Hero h1 = (Hero)t1.getChild(1);
		h1.display();
		
	}
}
