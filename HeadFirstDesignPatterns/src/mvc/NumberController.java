package mvc;

public class NumberController implements NumberControllerInterface{

	private SimpleNumberView view ;
	private NumberModelInterface model;
	public NumberController(NumberModelInterface model) {
		this.model = model;
		model.init();
		view = new SimpleNumberView(model, this);
	}
	@Override
	public void increase() {
		int number = model.getNumber();
		number++;
		model.setNuber(number);
	}
	@Override
	public void decrease() {
		int number = model.getNumber();
		number--;
		model.setNuber(number);		
	}
	
}
