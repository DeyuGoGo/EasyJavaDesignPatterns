package adapter;


public class Banana extends BaseItem {
	public Banana() {
		super(15);
	}
	@Override
	public String useWord() {
		return "�����W�[�F" + mQuantity + "HP�AOh yeah";
	}
}
