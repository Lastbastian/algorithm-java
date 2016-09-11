
public class VowelsLetters {
	for(int j = 1; j <= letters.getLength(); j++) {
		String currentLetter = letters.remove(j);
		if (currentLetter == String.valueOf('a') || 
				currentLetter == String.valueOf('e') || 
				currentLetter == String.valueOf('i') || 
				currentLetter == String.valueOf('o') ||
				currentLetter == String.valueOf('u'))
			vowels.add(currentLetter);
	}
	int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
	
	for(int i = 1; i <= vowels.getLength(); i++) {
		String currentVowel = vowels.getEntry(i);
		
		if(currentVowel == String.valueOf('a'))
			aCount++;
		if(currentVowel == String.valueOf('e'))
			eCount++;
		if(currentVowel == String.valueOf('i'))
			iCount++;
		if(currentVowel == String.valueOf('o'))
			oCount++;
		if(currentVowel == String.valueOf('u'))
			uCount++;	
	}
	
	System.out.println("There are " + vowels.getLength() + " vowels in the list:");
	System.out.println("a- " + aCount);
	System.out.println("e- " + eCount);
	System.out.println("e- " + iCount);
	System.out.println("o- " + oCount);
	System.out.println("u- " + uCount);
}
