package mvc;

import java.util.ArrayList;

public class NumberModel implements NumberModelInterface{
	private int number ;
	private ArrayList<NumberListener> Listeners ;
	public NumberModel() {
		Listeners = new ArrayList<NumberListener>();
	}

	@Override
	public void init() {
		number = 0;		
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNuber(int number) {
		this.number = number;
		onNumberChange();
	}

	@Override
	public void registerListener(NumberListener Listener) {
		Listeners.add(Listener);
	}

	@Override
	public void ungisterListener(NumberListener Listener) {
		Listeners.remove(Listener);
		
	}
	
	public void onNumberChange() {
		for(NumberListener listener : Listeners){
			if(listener!=null)listener.onNumberChnage();
		}
	}

}
