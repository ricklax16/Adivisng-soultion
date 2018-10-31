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

	private JFrame frame;
	private JTextField textField;
	private JButton btnGrabClasses;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1072, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Still need to create IDNum
		
		
		
		
		
		 textArea = new JTextArea();
		textArea.setBounds(56, 77, 906, 474);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(117, 26, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID:");
		lblIdNumber.setBounds(78, 29, 27, 16);
		frame.getContentPane().add(lblIdNumber);
		
		 btnGrabClasses = new JButton("Grab Classes");
		btnGrabClasses.setBounds(256, 26, 137, 22);
		frame.getContentPane().add(btnGrabClasses);
		btnGrabClasses.addActionListener(this);
		btnGrabClasses.setActionCommand("enable");
		
		
	}
	
			

public void actionPerforment(ActionEvent e) {
	//Check if button was clicked 
	if("enable".equals(e.getActionCommand())) {
	btnGrabClasses.setText("TEST");
	int count=0;
	if(e.getSource()==btnGrabClasses);
	String IDNum = textField.getText();
	String line = null;
	FileReader file;
	try {
		file = new FileReader(IDNum+".txt");
		BufferedReader bufferedReader = new BufferedReader(file);
		while((line = bufferedReader.readLine()) != null) {
			count++;
			//How can i print 2 lines? oh wait it will be two lines 
		    //textArea.append(line);
		    System.out.println("\n" + line);
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
                     
}}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	

}
