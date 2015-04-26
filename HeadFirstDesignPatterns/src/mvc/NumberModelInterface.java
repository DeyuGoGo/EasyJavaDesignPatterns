package mvc;

public interface NumberModelInterface {

	public void init();
	public int getNumber();
	public void setNuber(int number);
	public void registerListener(NumberListener Listener);
	public void ungisterListener(NumberListener Listener);
}
