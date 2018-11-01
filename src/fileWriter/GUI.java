package fileWriter;

import java.util.Scanner;
import java.io.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI implements ActionListener {

	private JFrame frame1;
	private JTextField textField;
	private JButton btnGrabClasses;
	private JTextArea textArea;
	private JButton btnUpdateFile;
	public String IDNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 1072, 696);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		//Still need to create IDNum
		
		
		
		
		
		 textArea = new JTextArea();
		textArea.setBounds(56, 77, 906, 474);
		frame1.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(117, 26, 116, 22);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID:");
		lblIdNumber.setBounds(78, 29, 27, 16);
		frame1.getContentPane().add(lblIdNumber);
		
		 btnGrabClasses = new JButton("Grab Classes");
		btnGrabClasses.setBounds(256, 26, 137, 22);
		frame1.getContentPane().add(btnGrabClasses);
		btnGrabClasses.addActionListener(new load());
		btnGrabClasses.setActionCommand("enable");
		
		btnUpdateFile = new JButton("Update File");
		btnUpdateFile.setBounds(117, 587, 97, 25);
		frame1.getContentPane().add(btnUpdateFile);
		btnUpdateFile.addActionListener(new update());
		
	}
	
			



public class load implements ActionListener{
public void actionPerformed(ActionEvent arg0) {
	if("enable".equals(arg0.getActionCommand())) {
		btnGrabClasses.setText("TEST");
		int count=0;
		if(arg0.getSource()==btnGrabClasses);
		IDNum = textField.getText();
		String line = null;
		FileReader file;
		try {
			file = new FileReader(IDNum+".txt");
			BufferedReader bufferedReader = new BufferedReader(file);
			while((line = bufferedReader.readLine()) != null) {
				count++;
				//How can i print 2 lines? oh wait it will be two lines 
			    //textArea.append(line);
			    textArea.read( bufferedReader, null );
			}
	bufferedReader.close(); 
		file.close();
		
		} catch (FileNotFoundException e2) {
			System.out.println(
	                "Unable to open file '" + 
	                IDNum + "'");
		} 
		
	     catch (IOException e1) {
	    	 System.out.println(
	                 "Error reading file '" 
	                 + IDNum + "'"); 
		}
		// Always close files.
	                     
	}
	
}
}
public class update implements ActionListener{
public void actionPerformed(ActionEvent e) {
	 try {
         
         BufferedWriter outFile = new BufferedWriter(new FileWriter(IDNum+".txt"));
         outFile.write(textArea.getText()); 

         outFile.close();
     } catch (IOException ex) {
     }



}
}
}