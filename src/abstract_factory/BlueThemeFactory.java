package abstract_factory;

public class BlueThemeFactory implements ThemeFactory{

	@Override
	public Label getLabel() {
		return new BlueLabel();
	}

	@Override
	public Button getButton() {
		return new BlueButton();
	}

}
