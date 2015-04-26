package composite;


public class EmperorLegion extends Team{
	private Team t1 ;
	private Team t2 ;
	private Team t3 ;
	public EmperorLegion(){
		super("�Ұ�̱j�x��");
		t1 = new Team("�Ĥ@�x��");
		t1.add(new Hero("�Ĥ@�M�h", "�M�h"));
		t1.add(new Hero("�Ĥ@�k�v", "�k�v"));
		t2 = new Team("���ݲĤ@�x���O�ʶ�");
		t2.add(new Hero("�p�M�h", "�M�h"));
		t2.add(new Hero("�p�k�v", "�k�v"));
		add(t2);
		t3 = new Team("�ĤG�x��");
		t3.add(new Hero("��-4�M�h", "�M�h"));
		t3.add(new Hero("��23�k�v", "�k�v"));
		add(t1);
		add(t3);
	}
}
