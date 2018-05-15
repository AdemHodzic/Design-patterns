package facade;

public class App {

	public static void main(String[] args) {
		
		String first = "Hello";
		String second = "World";
		
		//Wrong way, this could happend beacuse of outdated API or something like that
		//This way of doing this is funcitonally correct but it could be far much complex and less readable
		ComplexWordBuilder complex = new ComplexWordBuilder();
		complex.setFirstCharacter(first.charAt(0));
		complex.setSecondCharacter(first.charAt(1));
		complex.setThirdCharacter(first.charAt(2));
		complex.setFourthCharacter(first.charAt(3));
		complex.setFifthCharacter(first.charAt(4));
		
		System.out.println("String we got the wrong way: " + complex.getWord());
		
		//The right way, using a facade we created for ComplexWordBuilder
		//Instead of calling setFirstCharacer, setSecondCharacter,...
		//we can just call one method setWord
		SimpleWordBuilder simple = new SimpleWordBuilder();
		simple.setWord(second);
		
		System.out.println("String we got the right way: " + simple.getWord());
	}

}
