package fileWriter;

public class TestReturn {
	public static void main(String[] args) {
		String name = TemplateRead.getName();
		String major = TemplateRead.getMajor();
		int ID = TemplateRead.getID();
		System.out.println(name+" "+major+" "+ID );
	}
}
