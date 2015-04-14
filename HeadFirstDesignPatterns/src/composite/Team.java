package composite;

import java.util.ArrayList;

import util.JavaLog;

public class Team extends Brave{
	
	private ArrayList<Brave> braves = new ArrayList<Brave>();
	
	public Team(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Brave brave) {
		braves.add(brave);
	}
	@Override
	public void remove(Brave brave) {
		braves.remove(brave);
	}
	@Override
	public Brave getChild(int i) {
		return braves.get(i);
	}
	@Override
	public String getJob() {
		StringBuffer sb = new StringBuffer();
//		Iterator<Brave> iterator = braves.iterator();
		for( Brave b: braves){
			sb.append(b.getJob());
		}
		return sb.toString();
	}
	@Override
	public void display() {
		JavaLog.d(name);
		for(Brave b: braves){
			b.display();
		}
	}
}
