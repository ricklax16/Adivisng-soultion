package fileWriter;
import java.util.Scanner;

public class studentTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "void";
		int ID = 000000;
		String major = "void";
		String advisor = "void";
		
		System.out.print("ID Number");
			ID = input.nextInt();
		System.out.print("Name");
			name = input.next();
			input.nextLine();
		System.out.print("Major");
			major = input.next();
			input.nextLine();
		System.out.print("Advisor");
			advisor = input.next();
			input.nextLine();
		input.close();
		
		Student test = new Student(name);
		
		test.Id(ID);
		test.Major(major);
		test.Advisor(advisor);
		test.printStudent();
		System.out.println(test.getName()+" "+test.getId());
		
	}
}
