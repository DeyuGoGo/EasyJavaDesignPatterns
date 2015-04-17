package state;

import factory.client.ClientCoder;

public class ClientCodeWorker extends Worker{
	private ClientCoder clientCoderWorker;
	public ClientCodeWorker(ClientCoder clientCodeWorker) {
		this.clientCoderWorker = clientCodeWorker;
	}

	@Override
	public void doWork() {
		clientCoderWorker.Go();
	}

	@Override
	protected JobState getInitWorkingJobState() {
		return new WorkingState(this);
	}

	@Override
	protected JobState getInitNoJobState() {
		return new NoJobState(this) ;
	}
	

}
