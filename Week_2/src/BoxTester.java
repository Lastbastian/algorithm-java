
public class BoxTester {
	public static void main(String[] args) {
		BoxR numbersBox = new BoxR(new Integer(4));
		numbersBox.replaceContents(new Integer(6));
		numbersBox.replaceContents(new String("hello"));
		
		Integer currentContents = (Integer) numbersBox.getContents();
		
		System.out.println(numbersBox);
	}
}
