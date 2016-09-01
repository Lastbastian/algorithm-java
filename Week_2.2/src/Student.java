
public class Student {
	private int studentID;
	
	public Student(int studentID) {
		this.studentID = studentID;
	}

	public int getStudentID() {
		return this.studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	@Override
	public boolean equals() {
		return 
	}
	
	@Override
	public String toString() {
		return "Student ID: " + studentID;
	}
}
