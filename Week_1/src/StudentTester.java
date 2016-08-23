
public class StudentTester {
	public static void main (String[] args)
	{
		Student s1 = new Student("Bob", "Smith", 12345);
		Student s2 = new Student("Suzy", "Wallaby", 12346);
		Student s3 = new Student("Bart", "Simpson", 12344);
		Student s4 = new Student("Bob", "Smith", 12345);
		
		Course c = new Course("Intro to Java", 15);
		c.enrollStudent(s1);
		c.enrollStudent(s2);
		c.enrollStudent(s3);
		
		c.printRoster();
		
//		s3.setLastName("Markington");
//		s3.setStudentID(999999999);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);	
//		System.out.println("Are they equal? " + s1.equals(s2));
//		System.out.println("Are they equal? " + s1.equals(s4));
//		System.out.println("Are they aliases? " + (s1==s4));
	}
}