package fileWriter;

import java.util.Scanner;

public class ClassTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String section;
		int number;
		String desc;
		int creditH;
		
	System.out.print("What School is the class in?");
		section = input.next();
		input.nextLine();
	System.out.print("What is the course number?");
		number = input.nextInt();
		input.nextLine();
	System.out.print("What is the course Description");
		desc = input.nextLine();
	System.out.print("How many Credit hours is the course?");
		creditH = input.nextInt();
	input.close();
		ClassObj test = new ClassObj();
		test.Section(section);
		test.courseNumber(number);
		test.courseDesc(desc);
		test.creditHours(creditH);
		test.printCourse();
		System.out.println("GETTER:" + test.getSection());
		
	}
}