package factory.pm;

import factory.client.ClientCoder;
import factory.cloud.CloudCode;
import factory.firmware.FirmwareCode;

// this abstract factory to create Software components
public interface PM {
	public CloudCode createCloudCode();
	public ClientCoder createClientCode();
	public FirmwareCode createFirmwareCode();
	
}
