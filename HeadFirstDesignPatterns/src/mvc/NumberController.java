package mvc;

public class NumberController implements NumberControllerInterface{

	private NumberModelInterface model;
	public NumberController(NumberModelInterface model) {
		this.model = model;
		model.init();
		new SimpleNumberView(model, this);
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
