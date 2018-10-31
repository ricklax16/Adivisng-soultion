package fileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Template {
		private String path;
		private boolean append_to_file = false;
		
public Template(String file_path){
	path = file_path;
	
}

public Template(String file_path, boolean append_value){
	path = file_path;
	append_to_file = append_value;
	
}
public void writeToFile(String textLine) throws IOException{
	FileWriter write = new FileWriter(path, append_to_file);
	PrintWriter print_line = new PrintWriter(write);
	
	print_line.printf("%s" + "%n",textLine);
	
	print_line.close();
}
}
