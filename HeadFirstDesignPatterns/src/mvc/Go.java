package mvc;

public class Go {
	public static void main(String[] args) {
		NumberModelInterface model = new NumberModel();
		new NumberController(model);
	}
}
