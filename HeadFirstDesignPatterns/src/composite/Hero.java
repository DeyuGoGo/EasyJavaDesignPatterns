package composite;

import util.JavaLog;

public class Hero extends Brave{
	private String Job ;
	public Hero(String name , String Job) {
		this.name = name;
		this.Job = Job;
	}
	@Override
	public String getJob() {
		return Job;
	}
	@Override
	public void display() {
		JavaLog.d("Â¾·~¡G" + Job + " ¦WºÙ¡G " + name);
	}
}
