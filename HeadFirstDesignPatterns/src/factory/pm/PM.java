package factory.pm;

import factory.client.ClientCode;
import factory.cloud.CloudCode;
import factory.firmware.FirmwareCode;

// this abstract factory to create Software components
public interface PM {
	public CloudCode createCloudCode();
	public ClientCode createClientCode();
	public FirmwareCode createFirmwareCode();
	
}
