package state;

import util.JavaLog;

public class WorkingState implements JobState{
	
	private Worker mWorker ; 
	public WorkingState(Worker worker){
		this.mWorker = worker;
	}
	@Override
	public void interview() {
		JavaLog.d("Reject I hava Job now");
	}

	@Override
	public void fire() {
		JavaLog.d("Thank you");
		mWorker.setState(mWorker.getNoJobState());
	}

	@Override
	public void hire() {
		JavaLog.d("I already have a job");
	}

	@Override
	public void work() {
		mWorker.doWork();
	}

	@Override
	public void readBook() {
		JavaLog.d("I want to sleep....");
	}

}