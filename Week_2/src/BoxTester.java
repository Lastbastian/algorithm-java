
public class BoxTester {
	public static void main(String[] args) {
		BoxR numbersBoxNotReally = new BoxR(new Integer(4));
		numbersBoxNotReally.replaceContents(new Integer(6));
//		numbersBoxNotReally.replaceContents(new String("hello"));
		
		Integer currentContents = (Integer) numbersBoxNotReally.getContents();
		
		System.out.println(numbersBoxNotReally);
		
		Box<Integer> numbersBox = new Box<Integer>(new Integer(4));  // You have to specify type in <> otherwise you can add strings and other types which defeats the purpose of our generic based class.
		numbersBox.replaceContents(new Integer(9));
		
		Box<String> stringsBox = new Box<String>(new String("Hello"));
		stringsBox.replaceContents(new String("Hi"));
		
		Box<String> wordBox = new Box<String>("Hi");
		wordBox.replaceContents(new String ("Hi"));
		
		System.out.println(stringsBox.equals(wordBox));
	}
}