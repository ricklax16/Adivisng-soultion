package fileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class EditFile {

	public static void main(String[] args) {

	    try{
	        String verify, putData;
	        File file = new File("file.txt");
	       // file.createNewFile();
	        FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write("Incomplete ");
	        bw.flush();

	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);

	        while( (verify=br.readLine()) != null )
	        { 
	            if(verify != null)
	            {
	                putData = verify.replaceAll("Incomplete", "Complete");
	                bw.write(putData);
	            }
	        }
	        br.close();
	        bw.close();

	    }catch(IOException e){
	    e.printStackTrace();
	    }
	}
	}