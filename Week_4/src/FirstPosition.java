
public class FirstPosition {
	int count = 0;
	int firstPosition = 1;
	for(int i = 1; i <= myList.getLength(); i++) {
		Integer currentItem = myList.getEntry(i);
		
		if (currentItem == givenItem) {
			count++;
			if (count == 2)
				firstPosition = i;
		}	
	}
	return firstPosition;
}
