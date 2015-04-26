package state;

public abstract class Worker {
	
	protected JobState noJobState ;
	protected JobState workingJobState ;
	
	protected JobState state ;
	
	public Worker() {
		this.noJobState = getInitNoJobState();
		this.workingJobState = getInitWorkingJobState();
		this.state = noJobState; 
	}
	
	public void interview(){
		state.interview();
	}
	
	public void hire(){
		state.hire();
	}
	
	public void fire(){
		state.fire();
	}
	
	public void learn(){
		state.readBook();
	}
	
	public void work(){
		state.work();
	}
	
	public abstract void doWork();

	public JobState getNoJobState() {
		return noJobState;
	}

	public void setNoJobState(JobState noJobState) {
		this.noJobState = noJobState;
	}

	public JobState getWorkingJobState() {
		return workingJobState;
	}

	public void setWorkingJobState(JobState workingJobState) {
		this.workingJobState = workingJobState;
	}

	public JobState getState() {
		return state;
	}

	public void setState(JobState state) {
		this.state = state;
	}
//	¼ËªO
	protected abstract JobState getInitWorkingJobState();
	protected abstract JobState getInitNoJobState();
	
}
