package composite;

import java.util.ArrayList;

public class EmperorLegion {
	private ArrayList<Brave> b = new ArrayList<Brave>();
	private Team t1 ;
	private Team t2 ;
	private Team t3 ;
	public EmperorLegion(){
		t1 = new Team("�Ĥ@�x��");
		t1.add(new Hero("�Ĥ@�M�h", "�M�h"));
		t1.add(new Hero("�Ĥ@�k�v", "�k�v"));
		t2 = new Team("���ݲĤ@�x���O�ʶ�");
		t2.add(new Hero("�p�M�h", "�M�h"));
		t2.add(new Hero("�p�k�v", "�k�v"));
		t1.add(t2);
		t3 = new Team("�ĤG�x��");
		t3.add(new Hero("��-4�M�h", "�M�h"));
		t3.add(new Hero("��23�k�v", "�k�v"));
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
		Team returnTeam = new Team("�M�h��");
		for(Brave b1: b){
			try {
				if(b1.getJob().equals("�M�h"))
					returnTeam.add(b1);
			} catch (NullPointerException e) {
			}
		}
		return returnTeam;
	}
	
}
