package abstract_factory;

public class DarkThemeFactory implements ThemeFactory{

	@Override
	public Label getLabel() {
		return new DarkLabel();
	}

	@Override
	public Button getButton() {
		return new DarkButton();
	}
}
