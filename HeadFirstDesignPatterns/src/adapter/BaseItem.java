package adapter;

public abstract class BaseItem implements Item{
	public final static int NO_USE_QUANTITY  = 0;
	protected int mQuantity = 0;
	public BaseItem(int quantity) {
		this.mQuantity = quantity;
	}
	
}
