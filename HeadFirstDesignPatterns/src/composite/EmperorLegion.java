package composite;

import java.util.ArrayList;

public class EmperorLegion {
	private ArrayList<Brave> b = new ArrayList<Brave>();
	private Team t1 ;
	private Team t2 ;
	private Team t3 ;
	public EmperorLegion(){
		t1 = new Team("第一軍團");
		t1.add(new Hero("第一騎士", "騎士"));
		t1.add(new Hero("第一法師", "法師"));
		t2 = new Team("隸屬第一軍隊別動隊");
		t2.add(new Hero("小騎士", "騎士"));
		t2.add(new Hero("小法師", "法師"));
		t1.add(t2);
		t3 = new Team("第二軍團");
		t3.add(new Hero("第-4騎士", "騎士"));
		t3.add(new Hero("第23法師", "法師"));
		b.add(t1);
		b.add(t3);
	}
	public Team getTeam1(){
		return t1;
	}
	public void rollcall(){
		for(Brave b1: b){
			b1.display();
		}
	}
	public Team getKnightTeam(){
		Team returnTeam = new Team("騎士團");
		for(Brave b1: b){
			try {
				if(b1.getJob().equals("騎士"))
					returnTeam.add(b1);
			} catch (NullPointerException e) {
			}
		}
		return returnTeam;
	}
	
}
