
public class Trio<T> {
	T first, second, third;
	
	public Trio(T firstItem, T secondItem, T thirdItem) {
		this.first = firstItem;
		this.second = secondItem;
		this.third = thirdItem;
	}
	
	public T getItem1() {
		return first;
	}
	
	public void setItem1(T firstItem) {
		this.first = firstItem;
	}
	
	public T getItem2() {
		return second;
	}
	
	public void setItem2(T secondItem) {
		this.second = secondItem;
	}

	public T getItem3() {
		return third;
	}
	
	public void setItem3(T thirdItem) {
		this.third = thirdItem;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}
	
	public boolean contains(T item) {
		return first == item || second == item || third == item;
	}
	
	public boolean sameItems() {
		return first == second && first == third && second == third;
	}
	
	public T sortTrio(T firstItem, T secondItem, T thirdItem) {
		boolean sorted = false;
		for (int i = 0; i < 3; i++) {
			
			
		}
	}
	
	@Override
	public boolean equals(Object other) {	
		if (other instanceof Trio) {
			Trio<T> myTrio = (Trio<T>) other;
			
		} else {
			return false;
		}	
	}
}
