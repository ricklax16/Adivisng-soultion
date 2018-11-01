package fileWriter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import fileWriter.Home.rtnStud;
import fileWriter.Home.rtnStud.load;
import fileWriter.Home.rtnStud.update;

public class WHOLEthing {

	private JFrame frame;
	private JFrame frame1;
	private JTextField textField;
	private JButton btnGrabClasses;
	private JTextArea textArea;
	private JButton btnUpdateFile;
	public String IDNum;
	private JTextField txtWelcome;
	public JButton btnReturningStudent;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WHOLEthing window = new WHOLEthing();
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
	public WHOLEthing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 932, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWelcome = new JTextField();
		txtWelcome.setBackground(Color.BLUE);
		txtWelcome.setForeground(Color.WHITE);
		txtWelcome.setFont(new Font("Stencil", Font.PLAIN, 34));
		txtWelcome.setEditable(false);
		txtWelcome.setText("Welcome to the advising Soultion");
		txtWelcome.setBounds(129, 28, 714, 103);
		frame.getContentPane().add(txtWelcome);
		txtWelcome.setColumns(10);
		
		btnReturningStudent = new JButton("Returning Student");
		btnReturningStudent.setBounds(316, 248, 157, 25);
		frame.add(btnReturningStudent);
		btnReturningStudent.addActionListener(new rtnStud());
	}
	
	public class rtnStud implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btnReturningStudent.setText("WORKED");
			
			frame1 = new JFrame();
			
			frame1.setBounds(100, 100, 1072, 696);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.getContentPane().setLayout(null);
			frame1.setVisible(true);
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
	

}}
