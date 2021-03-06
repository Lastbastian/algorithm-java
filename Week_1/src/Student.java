
public class Student implements Comparable<Student> {
	private String firstName, lastName;
	private int studentID;
	
	public Student(String firstName, String lastName, int studentID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName()	{
		return lastName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setFirstName (String value) 
	{
		this.firstName = value;
	}
	
	public void setLastName (String value) 
	{
		this.lastName = value;
	}
	
	public void setStudentID (int value) 
	{	
		if(value >= 0 && value <= 9999) {
			this.studentID = value;
		}
	}
	@Override
	public String toString()
	{
		return lastName + ", " + firstName + " - " + studentID;
	}	
	
	@Override
	public boolean equals(Object other)
	{	
		if (other instanceof Student) {
			Student myStudent = (Student) other;
			return this.studentID == myStudent.studentID;
		} else {
			return false;
		}	
	}

//	@Override
//	public int compareTo(Student other) {   // this compareTo is used for the Student class
//		if (lastName.compareTo(other.lastName)==0) { // this compareTo is used for the String class
//			return firstName.compareTo(other.firstName);
//		} else {
//			return lastName.compareTo(other.lastName);
//		}
//	}
	
	@Override
	public int compareTo(Student other) {
		if (studentID < other.studentID) {
			return -1;
		} else if (studentID > other.studentID) {
			return 1;
		} else {
			assert studentID == other.studentID;
			return 0;
		}
	}
}