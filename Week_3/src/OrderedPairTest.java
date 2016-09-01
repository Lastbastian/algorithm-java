
public class OrderedPairTest {

	public static void main(String[] args) {
		OrderedPair<String> fruits = new OrderedPair<String>("Apple", "Banana");
		
		System.out.println(fruits);
		
		System.out.println("The first item is " + fruits.getFirst() + " and the second item is " + fruits.getSecond() );
		fruits.changeOrder();
		System.out.println("Now the first item is " + fruits.getFirst() + " and the second item is " + fruits.getSecond() );
		System.out.println(fruits);
		
		OrderedPair<Integer> numbers = new OrderedPair<Integer>(5, 9);
		System.out.println(numbers);
		
		numbers.changeOrder();
		
		System.out.println(numbers);
	}
}