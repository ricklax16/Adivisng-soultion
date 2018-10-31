package fileWriter;
import java.io.*;
import java.util.Scanner;

public class TemplateRead {
	private static String major;
	private static String name;
	private static int ID;
	
	public static void main(String[] args)throws FileNotFoundException{
		File file1 = new File("1154594.txt"); //name of file should prob be changed
		Scanner input = new Scanner(file1); 
		
		name = "DefaultName"; //These names and information will need to be changed to private
		major = "DefaultMajor";//^
		ID = 123456;//^^
		
		Scanner fileScan = new Scanner(file1); //Start scanning the text file
		//fileScan.useDelimiter("[^0-9*]");
		ID = fileScan.nextInt();
		System.out.println(ID);
		//-----------For these next lines going to need ifs/safety checks
		fileScan.nextLine();
		name = fileScan.nextLine();
		
		String[] strings = name.split(": ");
		for(String str : strings){
			name = str;
			
		}
		System.out.println(name);
		//fileScan.nextLine();
		major = fileScan.nextLine();
		String[] strings2 = major.split(": ");
		for(String str : strings2){
			major = str;
			
		}
		System.out.println(major);
				
	}
	public static String getName() {
		String a = name;
		return a;
	}
	public static String getMajor() {
		String b = major;
		return b;
	}
	
	public static int getID() {
		int c = ID;
		return c;
	}
	
}
