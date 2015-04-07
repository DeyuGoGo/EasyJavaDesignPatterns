package factory.project;

import factory.pm.PM;


public class ProjectRestful extends SoftwareProject{
	
	public ProjectRestful(PM pm) {
		super(pm);
	}

	@Override
	public void prepare() {
		mClientCode = mPm.createClientCode();
		mCloudCode = mPm.createCloudCode();
	}

}
