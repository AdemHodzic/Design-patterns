package abstract_factory;

public class LightThemeFactory implements ThemeFactory{

	@Override
	public Label getLabel() {
		return new LightLabel();
	}

	@Override
	public Button getButton() {
		return new LightButton();
	}

}
