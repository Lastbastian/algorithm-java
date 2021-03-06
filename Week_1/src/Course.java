import java.util.ArrayList;
import java.util.Collections;

public class Course {
	private String courseName;
	private int numberEnrolled, maxEnrollment;
	private ArrayList<Student> students;
	
	public Course(String courseName, int maxEnrollment) {
		this.courseName = courseName;
		this.numberEnrolled = 0;
		this.maxEnrollment = maxEnrollment;
		students = new ArrayList<Student>();
	}
	
	public boolean enrollStudent(Student s) {
		if(numberEnrolled < maxEnrollment) {
			numberEnrolled++;
			return students.add(s);		// the add method on ArrayList returns a boolean so this method will now return T or F
		} else {
			return false;
		}		
	}
	
	public boolean isStudentEnrolled(Student s) {
		return students.contains(s);
	}
	
	public boolean dropStudent(Student s) {
		if (isStudentEnrolled(s)) {
			numberEnrolled--;
			return students.remove(s);
		} else {
			return false;
		}
	}
	
	public void printRoster() {
		Collections.sort(students);
		for (int i = 0; i < numberEnrolled; i++) {
			Student s = students.get(i);
			System.out.println(s);
		}
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