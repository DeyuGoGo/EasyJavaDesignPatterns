package factory.project;

import factory.pm.PM;

public class ProjectSoap extends SoftwareProject{
	
	public ProjectSoap(PM pm) {
		super(pm);
	}

	@Override
	public void prepare() {
		mClientCode = mPm.createClientCode();
		mCloudCode = mPm.createCloudCode();
		mFirmwareCode = mPm.createFirmwareCode();
	}

}
