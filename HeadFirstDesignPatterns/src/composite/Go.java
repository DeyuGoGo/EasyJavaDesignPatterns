package composite;


public class Go {
	public static void main(String[] args) {
		EmperorLegion el = new EmperorLegion();
		Commander C1 = new Commander(el);
		C1.rollcall();
	}
}
