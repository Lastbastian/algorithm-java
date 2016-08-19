
public class Student {
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
}