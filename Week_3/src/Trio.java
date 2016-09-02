
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
	
	@Override
	public boolean equals(Object other) {
		boolean result = false;
		boolean flag1 = false, flag2 = false, flag3 = false;
		if (other instanceof Trio) {
			Trio<T> myTrio = (Trio<T>) other;
			// Test first item
			if(this.first == myTrio.first)
				flag1 = true;
			else if(this.first == myTrio.second)
				flag2 = true;
			else if(this.first == myTrio.third)
				flag3 = true;
			// Test second item
			if(this.second == myTrio.first)
				flag1 = true;
			else if(this.second == myTrio.second)
				flag2 = true;
			else if(this.second == myTrio.third)
				flag3 = true;
			// Test third item
			if(this.third == myTrio.first)
				flag1 = true;
			else if(this.third == myTrio.second)
				flag2 = true;
			else if(this.third == myTrio.third)
				flag3 = true;
			
			if (flag1 && flag2 && flag3)
				result = true;
		} else {
			result = false;
		}
		return result;
	}	
}
