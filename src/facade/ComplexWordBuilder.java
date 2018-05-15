package facade;

public class ComplexWordBuilder {
	
	private char[] word;
	
	public ComplexWordBuilder() {
		word = new char[5];
	}
	
	public void setFirstCharacter(char c) {
		word[0] = c;
	}
	public void setSecondCharacter(char c) {
		word[1] = c;
	}
	public void setThirdCharacter(char c) {
		word[2] = c;
	}
	public void setFourthCharacter(char c) {
		word[3] = c;
	}
	public void setFifthCharacter(char c) {
		word[4] = c;
	}
	
	public String getWord() {
		return new String(this.word);
	}
	
}
