//Write a complete class that represents a computer, including: the class header, 
//instance data that describes the brand, the name, and the size of memory (e.g., HP All-in-One 1TB 
//or Apple iMac 128GB); at least two constructors 
//(you can choose the default values); getters and setters; and a toString method.

public class Computer {
	private String brand, model;
	private int memorySize;
	private final static String DEFAULT_BRAND = "None", DEFAULT_MODEL = "None";
	private final static int DEFAULT_MEMSIZE = 0;
	
	
	public Computer(String brand, String model, int memorySize) {
		this.brand = brand;
		this.model = model;
		this.memorySize = memorySize;
	}
	// No args constructor
	public Computer() {
		this.brand = DEFAULT_BRAND;
		this.model = DEFAULT_MODEL;
		this.memorySize = DEFAULT_MEMSIZE;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMemorySize() {
		return memorySize;
	}
	
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	public String toString() {
		return "Brand: " + brand + "\n\t Model: " + model + "\n\tMemory: " + memorySize;
	}
	
}
