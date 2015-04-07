package factory.company;

import factory.pm.PM;
import factory.pm.PMKen;
import factory.project.ProjectRestful;
import factory.project.ProjectSoap;
import factory.project.SoftwareProject;

public class ABCompany extends SWCompnay{

	private PM mPM = new PMKen();
	@Override
	protected SoftwareProject createSoftwareProject(String type) {
		SoftwareProject mSoftwareProject = null;
		if(type.equals("SOAP")){
			mSoftwareProject = new ProjectSoap(mPM);
		}
		if(type.equals("RESTFUL")){
			mSoftwareProject = new ProjectRestful(mPM);
		}
		return mSoftwareProject;
	}

}
