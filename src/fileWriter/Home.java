package fileWriter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import fileWriter.GUI.load;
import fileWriter.GUI.update;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToThe;
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
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 395);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setBackground(Color.BLUE);
		txtWelcomeToThe.setForeground(Color.WHITE);
		txtWelcomeToThe.setEditable(false);
		txtWelcomeToThe.setFont(new Font("Stencil", Font.PLAIN, 30));
		txtWelcomeToThe.setText("WELCOME to THE ADVISING SOULTION");
		txtWelcomeToThe.setBounds(135, 27, 578, 81);
		contentPane.add(txtWelcomeToThe);
		txtWelcomeToThe.setColumns(10);
		
		JButton btnReturningStudent = new JButton("Returning Student");
		btnReturningStudent.setBounds(316, 248, 157, 25);
		contentPane.add(btnReturningStudent);
		btnReturningStudent.addActionListener(new rtnStud());
	}
	public class rtnStud implements ActionListener{
		public void actionPerforment(ActionEvent e) {
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
}
