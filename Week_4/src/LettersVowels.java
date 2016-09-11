
public class LettersVowels {
	
	while(!letters.isEmpty()) {
		String currentLetter = letters.remove();
		if (currentLetter == String.valueOf('a') || 
				currentLetter == String.valueOf('e') || 
				currentLetter == String.valueOf('i') || 
				currentLetter == String.valueOf('o') ||
				currentLetter == String.valueOf('u'))
			vowels.add(currentLetter);
	}
	System.out.println("There are " + vowels.getCurrentSize() + " vowels in the bag:");
	System.out.println("a- " + vowels.getFrequencyOf(String.getValueOf('a')));
	System.out.println("e- " + vowels.getFrequencyOf(String.getValueOf('e')));
	System.out.println("i- " + vowels.getFrequencyOf(String.getValueOf('i')));
	System.out.println("o- " + vowels.getFrequencyOf(String.getValueOf('o')));
	System.out.println("u- " + vowels.getFrequencyOf(String.getValueOf('u')));
}

