package abstract_factory;

public class Window {
	
	private Button button;
	private Label label;
	
	public Window(Button button, Label label) {
		super();
		this.button = button;
		this.label = label;
	}
	
	public void displayLabel() {
		this.label.display();
	}
	
	public void displayButton() {
		this.button.display();
	}
	
}
