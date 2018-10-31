package fileWriter;

public class ClassObj {
	String section;
	int course_number;
	String course_description;
	int credits;
	
	public void Section(String input) {
		section = input;
	}
	public void courseNumber(int input) {
		course_number = input;
	}
	public void courseDesc(String input) {
		course_description = input;
	}
	public void creditHours(int input) {
		credits = input;
	}
	public void printCourse() {
		System.out.println("("+credits+") "+section+" "+course_number+" "+course_description);
		
	}
	public String getSection() {
		return section;
	}
	public int getCourse() {
		return course_number;
	}
	public String getDesc() {
		return course_description;
	}
	public int creditHours() {
		return credits;
	}
}
