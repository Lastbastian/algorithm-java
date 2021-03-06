
public class Box<T extends Comparable<? super T>> implements Comparable<Box<T>> { // The Capital letter in <> signifies generic type in our class
	private T thing;
	private int thingCount;
	
	public Box(T firstThing) {
		this.thing = firstThing;
		this.thingCount = 1;
	}

	public T getContents() {
		return thing;
	}

	public int getCount() {
		return thingCount;
	}
	
	public void replaceContents(T newThing) {
		this.thing = newThing;
		thingCount ++;
	}
	
	@Override 
	public String toString() {
		return thing.toString() + " (item " + thingCount + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Box<?>) {
			Box<?> otherBox = (Box<?>) other;  // CAST
			
			boolean sameThing = this.thing.equals(otherBox.thing);
			boolean sameCount = this.thingCount == (otherBox.thingCount);
			
			return sameThing && sameCount;
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Box<T> otherBox) {
		if(this.thing.compareTo(otherBox.thing)==0){
			return Integer.compare(this.thingCount, otherBox.thingCount);
		} else {
			return this.thing.compareTo(otherBox.thing);
		}
	}
}
