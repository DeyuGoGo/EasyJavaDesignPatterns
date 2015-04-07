package factory.pm;

import factory.client.ClientCode;
import factory.client.EngineerJay;
import factory.cloud.CloudCode;
import factory.cloud.EngineerLeo;
import factory.firmware.EngineerAndy;
import factory.firmware.FirmwareCode;

public class PMKen implements PM{

	@Override
	public CloudCode createCloudCode() {
		return new EngineerLeo();
	}

	@Override
	public ClientCode createClientCode() {
		return new EngineerJay();
	}

	@Override
	public FirmwareCode createFirmwareCode() {
		return new EngineerAndy();
	}

}
