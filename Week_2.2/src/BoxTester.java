import java.util.*;

public class BoxTester {
	public static void main(String[] args) {
		BoxR numbersBoxNotReally = new BoxR(new Integer(4));
		numbersBoxNotReally.replaceContents(new Integer(6));
//		numbersBoxNotReally.replaceContents(new String("hello"));
		
		Integer currentContents = (Integer) numbersBoxNotReally.getContents();
		
		System.out.println(numbersBoxNotReally);
		
		Box<Integer> numbersBox1 = new Box<Integer>(new Integer(4));  // You have to specify type in <> otherwise you can add strings and other types which defeats the purpose of our generic based class.
		numbersBox1.replaceContents(new Integer(9));
		
		Box<String> wordBox = new Box<String>(new String("Hello"));
		wordBox.replaceContents(new String("Hi"));
		
		Box<String> wordBox2 = new Box<String>("Hi");
		wordBox2.replaceContents(new String ("Hi"));
		
		Box<Integer> numbersBox2 = new Box<Integer>(new Integer(10));
		Box<Integer> numbersBox3 = new Box<Integer>(new Integer(2));
		Box<Integer> numbersBox4 = new Box<Integer>(new Integer(5));
		Box<Integer> numbersBox5 = new Box<Integer>(new Integer(7));
		
		ArrayList<Box<Integer>> listOfNumberBoxes = new ArrayList<Box<Integer>>();
		
		listOfNumberBoxes.add(numbersBox1);
		listOfNumberBoxes.add(numbersBox2);
		listOfNumberBoxes.add(numbersBox3);
		listOfNumberBoxes.add(numbersBox4);
		listOfNumberBoxes.add(numbersBox5);
		
		Collections.sort(listOfNumberBoxes);
		
		System.out.println(listOfNumberBoxes);
		
//		Integer.compare();		
		
//		System.out.println(wordBox.equals(wordBox2));
	}
}
