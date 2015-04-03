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
		JavaLog.d("沒做完別下班啊！！");
		return new EngineerTim();
	}

	@Override
	public ClientCode createClientCode() {
		JavaLog.d("這應該很簡單吧，你應該今天下午可以做完吧");
		return new EngineerDeyu();
	}
	@Override
	public FirmwareCode createFirmwareCode() {
		JavaLog.d("一秒鐘可以承受200 command吧？");
		return new EngineerAndy();
	}
	

}
