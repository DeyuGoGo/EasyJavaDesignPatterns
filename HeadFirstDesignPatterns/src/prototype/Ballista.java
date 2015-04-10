package prototype;

import util.JavaLog;

public class Ballista extends Thrower{

	
	public Ballista() {
		super(new GiantCrossbow());
	}
	
//	�ѳo�����O�M�w�n������A�o��n�����O�ǳƦn�}���A�ǳƪ��ϥΦb�����O�C
	@Override
	protected void setupThrowingObject() {
		setupCrossbow();
	}
	
	private void setupCrossbow(){
		JavaLog.d("�N�������b�w�˦ܩw��");
	}

//	���������]
	@Override
	public boolean hasfire() {
		return false;
	}
	
}
