
public class UnderGraduateStudent extends Student {
	boolean tuitionPaid;
	
	public UnderGraduateStudent(String firstName, String lastName, int studentID, boolean tuitionPaid) {
		super(firstName, lastName, studentID);
		this.tuitionPaid = tuitionPaid;
	}
	
	public void setTuitionPaid(boolean tuitionPaid) {
		this.tuitionPaid = tuitionPaid;
	}
	
	public boolean getTuitionPaid() {
		return tuitionPaid;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\n\tTuition Paid: " + tuitionPaid;
		return s;
	}
}
