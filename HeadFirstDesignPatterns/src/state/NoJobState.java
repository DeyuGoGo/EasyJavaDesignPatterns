package state;

import util.JavaLog;

public class NoJobState implements JobState{
	
	private Worker mWorker ; 
	public NoJobState(Worker worker){
		this.mWorker = worker;
	}
	@Override
	public void interview() {
		JavaLog.d("Let's go interview");
	}

	@Override
	public void fire() {
		JavaLog.d("I have no job = =");
	}

	@Override
	public void hire() {
		JavaLog.d("Let's go to work");
		mWorker.setState(mWorker.getWorkingJobState());
	}

	@Override
	public void work() {
		JavaLog.d("I have no job to work");
	}

	@Override
	public void readBook() {
		JavaLog.d("Let's go read book");
	}

}
