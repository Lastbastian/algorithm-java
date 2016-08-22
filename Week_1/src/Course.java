import java.util.ArrayList;

public class Course {
	private String courseName;
	private int numberEnrolled, maxEnrollment;
	private ArrayList students;
	
	public void Course(String courseName, int maxEnrollment) {
		this.courseName = courseName;
		this.numberEnrolled = 0;
		this.maxEnrollment = maxEnrollment;
		students = new ArrayList();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumberEnrolled() {
		
		return numberEnrolled;
	}

	public int getMaxEnrollment() {
		return maxEnrollment;
	}

	public void setMaxEnrollment(int maxEnrollment) {
		if(maxEnrollment >= 1)
			this.maxEnrollment = maxEnrollment;
	}

	public ArrayList getStudents() {
		return students;
	}
	
	@Override
	public String toString() {
		return courseName + " (" + numberEnrolled + " out of " + maxEnrollment + " spots filled)";
	}
	}
}