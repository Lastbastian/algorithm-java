
public class StudentTester {
	public static void main (String[] args)
	{
		Student s1 = new Student("Bob", "Smith", 12345);
		Student s2 = new Student("Suzy", "Wallaby", 12346);
		Student s3 = new Student("Bart", "Simpson", 12347);
		
		s3.setLastName("Markington");
		s3.setStudentID(999999999);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
	}

}
