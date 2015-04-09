package adapter;


public class Banana extends BaseItem {
	public Banana() {
		super(15);
	}
	@Override
	public String useWord() {
		return "香蕉增加了" + mQuantity + "HP，Oh yeah";
	}
}
