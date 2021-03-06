import java.util.ArrayList;


public class StudentTester {
	public static void main (String[] args)
	{
		Student [] theStudents = new Student[5];
		
		theStudents[0] = new Student("Bob", "Smith", 12345);
		theStudents[1] = new Student("Suzy", "Wallaby", 12346);
		theStudents[2] = new Student("Bart", "Simpson", 12344);
		
		// both of the below work because of polymorphism a GradStudent is a Student. 
		Student g1 = new GradStudent("Greg", "Winklby", 12343, "The Universise of Everything");	
		GradStudent g2 = new GradStudent("Tamara", "Lollyfingle", 12340);	
		
		theStudents[3] = g1;
		theStudents[4] = g2;
		
//		System.out.println(g1.getThesisTopic()); - COMPILER ERROR because the DECLARED type is a Student and getThesisTopic() doesn't exist for that class although it does for GradStudent.
		System.out.println(g2.getThesisTopic()); // This works because the method exists in GradStudent
		
		Course c = new Course("Intro to Java", 15);
		c.enrollStudent(theStudents[0]);
		c.enrollStudent(theStudents[1]);
		c.enrollStudent(theStudents[2]);
		c.enrollStudent(g1);
		c.enrollStudent(g2);
		
		ArrayList<String> myStuff = new ArrayList<String>();
		myStuff.add("This");
		myStuff.add("That");
		
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
		
		for(int i = 0; i < theStudents.length; i++) {
			Student st = theStudents[i];
			if(st instanceof GradStudent) { // instanceof checks the actual type at runtime
				GradStudent gs = (GradStudent) st;
				
				System.out.println("\n\t" + gs.getThesisTopic());	
			}
		}
	}
}