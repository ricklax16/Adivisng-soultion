package fileWriter;

public class Student {
	int identification;
	String name;
	String major;
	String advisor;
	
	public Student(String name) {
		this.name=name;
	}
	public void Major(String Smajor) {
		major = Smajor;
	}
	public void Id(int identity) {
		identification = identity;
	}
	public void Advisor(String adv) {
		advisor = adv;
	}
	public void printStudent() {
		System.out.println(identification);
		System.out.println(name);
		System.out.println(major);
		System.out.println(advisor);
	}
	public int getId() {
		return identification;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getAdvisor() {
		return advisor;
	}
}
