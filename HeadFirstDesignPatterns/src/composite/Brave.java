package composite;

public abstract class Brave {
	
	protected String name = "No Name";

	public void add(Brave brave){
		throw new UnsupportedOperationException();
	}
	public void remove(Brave brave){
		throw new UnsupportedOperationException();
	}
	public Brave getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		return name;
	}
	public String getJob(){
		throw new UnsupportedOperationException();
	}
	public void display(){
		throw new UnsupportedOperationException();
	}
}
