package factory.project;

import factory.client.ClientCode;
import factory.cloud.CloudCode;
import factory.firmware.FirmwareCode;
import factory.pm.PM;

public abstract class SoftwareProject {
	protected CloudCode mCloudCode;
	protected ClientCode mClientCode;
	protected FirmwareCode mFirmwareCode;
	protected PM mPm;
	public SoftwareProject(PM pm) {
		this.mPm = pm ;
	}
//	Factory method let child class to imp 
	public abstract void prepare();
	
	public void Run(){
		if(mClientCode!=null)mClientCode.Go();
		if(mCloudCode!=null)mCloudCode.Go();
		if(mFirmwareCode!=null)mFirmwareCode.Go();
	}
}
