import java.util.*;

public class NameInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> nameList = new ArrayList<String>();		

		System.out.println("Enter names or \"quit\" to quit:");
		String name = scan.nextLine();
		
		while(!name.equalsIgnoreCase("quit")) {
			nameList.add(name);
			
			System.out.println("Enter names of \"quit\" to quit:");
			name = scan.nextLine();
		}
		
		Collections.sort(nameList);
		
		System.out.println(nameList);
	}
}
