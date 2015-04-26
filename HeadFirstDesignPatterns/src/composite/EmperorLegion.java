package composite;


public class EmperorLegion extends Team{
	private Team t1 ;
	private Team t2 ;
	private Team t3 ;
	public EmperorLegion(){
		super("帝國最強軍團");
		t1 = new Team("第一軍團");
		t1.add(new Hero("第一騎士", "騎士"));
		t1.add(new Hero("第一法師", "法師"));
		t2 = new Team("隸屬第一軍隊別動隊");
		t2.add(new Hero("小騎士", "騎士"));
		t2.add(new Hero("小法師", "法師"));
		add(t2);
		t3 = new Team("第二軍團");
		t3.add(new Hero("第-4騎士", "騎士"));
		t3.add(new Hero("第23法師", "法師"));
		add(t1);
		add(t3);
	}
}
