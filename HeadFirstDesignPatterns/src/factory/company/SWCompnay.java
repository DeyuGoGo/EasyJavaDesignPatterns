package factory.company;

import factory.project.SoftwareProject;

// this abstract factory to create Software
public abstract class SWCompnay {

//	Factory method let child imp 
	protected abstract SoftwareProject createSoftwareProject(String type);

	public SoftwareProject releaseSoftwareProject(String type){
		SoftwareProject mSoftwareProject;
		mSoftwareProject = createSoftwareProject(type);
		mSoftwareProject.prepare();
		mSoftwareProject.Run();
		return mSoftwareProject;
	}
}
