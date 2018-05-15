package facade;

public class SimpleWordBuilder {
	
	private ComplexWordBuilder wordBuilder;
	
	public SimpleWordBuilder() {
		this.wordBuilder = new ComplexWordBuilder();
	}
	
	public void setWord(String word) {
		if(word.length() > 0)
			wordBuilder.setFirstCharacter(word.charAt(0));
		if(word.length() > 1)
			wordBuilder.setSecondCharacter(word.charAt(1));
		if(word.length() > 2)
			wordBuilder.setThirdCharacter(word.charAt(2));
		if(word.length() > 3)
			wordBuilder.setFourthCharacter(word.charAt(3));
		if(word.length() > 4)
			wordBuilder.setFifthCharacter(word.charAt(4));
	}
	
	public String getWord() {
		return wordBuilder.getWord();
	}
}
