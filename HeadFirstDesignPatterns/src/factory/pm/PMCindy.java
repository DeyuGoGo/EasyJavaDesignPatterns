package factory.pm;

import util.JavaLog;
import factory.client.ClientCode;
import factory.client.EngineerDeyu;
import factory.cloud.CloudCode;
import factory.cloud.EngineerTim;
import factory.firmware.EngineerAndy;
import factory.firmware.FirmwareCode;

public class PMCindy implements PM{
	@Override
	public CloudCode createCloudCode() {
		JavaLog.d("�S�����O�U�Z�ڡI�I");
		return new EngineerTim();
	}

	@Override
	public ClientCode createClientCode() {
		JavaLog.d("�o���ӫ�²��a�A�A���Ӥ��ѤU�ȥi�H�����a");
		return new EngineerDeyu();
	}
	@Override
	public FirmwareCode createFirmwareCode() {
		JavaLog.d("�@�����i�H�Ө�200 command�a�H");
		return new EngineerAndy();
	}
	

}
