
public class Contains {
	
	public boolean listContains (ListInterface<String> myList, String item) {
		boolean result = false;
		for (int i = 1; i <= myList.getLength(); i++) {
			if(myList.getEntry(i) == item)
				result = true;
		}
		return result;
	}

}
