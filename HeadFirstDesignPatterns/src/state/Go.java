package state;

import factory.client.EngineerDeyu;

public class Go {
	public static void main(String[] args) {
		Worker Deyu= new ClientCodeWorker(new EngineerDeyu());
//		Nojob
		Deyu.work();
		Deyu.learn();
		Deyu.interview();
		Deyu.fire();
		Deyu.hire();
//		get hire working
		Deyu.work();
		Deyu.learn();
		Deyu.interview();
		Deyu.hire();
		Deyu.fire();
	}
}
