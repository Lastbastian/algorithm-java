
public class FirstLastChanger {
	
	listLength = studentList.getLength();
	for(int i = 1; i <= listLength; i++)
		System.out.println(studentList.fullName.getLast());
	
	Student newFirstStudent = new Student(studentList.getEntry(listLength));
	Student newLastStudent = new Student(studentList.getEntry(1));
	
	studentList.replace(1, newFirstStudent);
	studentList.replace(listLength, newLastStudent);
		
	for(int i = 1; i <= listLength; i++)
		System.out.println(studentList.fullName.getLast());
}