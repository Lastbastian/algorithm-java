
public class GradStudent extends Student {
	private String thesisTopic;
	private final static String UNDEFINED_TOPIC = "Thesis Topic Undefined";
	
	
	public GradStudent(String firstName, String lastName, int studentID, String thesisTopic) {
		super(firstName, lastName, studentID); // calls the parent constructor(Student)
		this.thesisTopic = thesisTopic; // child specific initialization
		
	}
	
	// Overload constructor that used for student w/no topic
	public GradStudent(String firstName, String lastName, int studentID) {
		this(firstName, lastName, studentID, UNDEFINED_TOPIC); // this calls the class constructor above and subs our constant
	}
	
	public String getThesisTopic() {
		return thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	
	@Override
	public String toString() {
		String s = super.toString();  // sets s to parent toString method
		s += "\n\tThesis Topic: " + thesisTopic;
		return s;
	}
}
