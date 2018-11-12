package fileWriter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import fileWriter.GUI.Prin;
import fileWriter.Home.rtnStud;
import fileWriter.Home.rtnStud.load;
import fileWriter.Home.rtnStud.update;
import fileWriter.NewStundent.NewStud;

import javax.swing.JTable;

public class WHOLEthing {
	public JComboBox<String> comboBox;
	private JFrame frame;
	private JFrame frame1;
	private JFrame frame2;
	private JTextField textField;
	private JButton btnGrabClasses;
	private JTextArea textArea;
	private JButton btnUpdateFile;
	public String IDNum;
	private JTextField txtWelcome;
	public JButton btnReturningStudent;
	public JButton btnAddNewMajor;
	private JTable table;
	private JButton btnAddMajor;
	private JTextField txtMajorname;
	private JFrame frame4;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtYear;
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 932, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWelcome = new JTextField();
		txtWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		txtWelcome.setBackground(Color.WHITE);
		txtWelcome.setForeground(Color.BLACK);
		txtWelcome.setFont(new Font("Helvetica", Font.BOLD, 34));
		txtWelcome.setEditable(false);
		txtWelcome.setText("Welcome to the Advising Soultion");
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setBounds(105, 28, 714, 103);
		frame.getContentPane().add(txtWelcome);
		txtWelcome.setColumns(10);
		Border border = BorderFactory.createLineBorder(Color.WHITE, 5);
		txtWelcome.setBorder(border);

		
		btnReturningStudent = new JButton("Returning Student");
		btnReturningStudent.setBounds(115, 244, 173, 37);
		btnReturningStudent.setFont(new Font("Helvetica", Font.BOLD, 15));
		frame.getContentPane().add(btnReturningStudent);
		btnReturningStudent.addActionListener(new rtnStud());
		
		btnAddNewMajor = new JButton("Add New Major");
		btnAddNewMajor.setBounds(115, 161, 173, 37);
		btnAddNewMajor.setFont(new Font("Helvetica", Font.BOLD, 15));
		frame.getContentPane().add(btnAddNewMajor);
		btnAddNewMajor.addActionListener(new major());
		
		ImageIcon image = new ImageIcon("RWULogo.png");
		JLabel imageLabel = new JLabel(image);
		imageLabel.setBounds(374, 161, 410, 259);
		frame.getContentPane().add(imageLabel);
		
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.setFont(new Font("Helvetica", Font.BOLD, 15));
		btnNewStudent.setBounds(115, 317, 173, 37);
		frame.getContentPane().add(btnNewStudent);
		btnNewStudent.addActionListener(new Student());
	}
	
	public class Student implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			frame4 = new JFrame();
			frame4.setBounds(100, 100, 873, 564);
			frame4.getContentPane().setBackground(Color.WHITE);
			frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame4.getContentPane().setLayout(null);
			frame4.setVisible(true);
			
			String[] majorStrings = { "B.S. Computer Science", "Engineering", "Construction Managment", "B.A. Computer Science" };
			
			comboBox = new JComboBox(majorStrings);
			comboBox.setBounds(521, 70, 264, 37);
			comboBox.setFont(new Font("Helvetica", Font.BOLD, 15));
			frame4.getContentPane().add(comboBox);
			comboBox.setEditable(true);
			
			JLabel lblMajor = new JLabel("Major:");
			lblMajor.setFont(new Font("Helvetica", Font.BOLD, 19));
			lblMajor.setBounds(434, 75, 60, 25);
			frame4.getContentPane().add(lblMajor);
			
			txtId = new JTextField();
			txtId.setBounds(150, 70, 173, 37);
			txtId.setFont(new Font("Helvetica", Font.PLAIN, 15));
			frame4.getContentPane().add(txtId);
			txtId.setColumns(10);
			
			JLabel lblStudentid = new JLabel("StudentID:");
			lblStudentid.setFont(new Font("Helvetica", Font.BOLD, 18));
			lblStudentid.setBounds(42, 77, 100, 16);
			frame4.getContentPane().add(lblStudentid);
			
			txtName = new JTextField();
			txtName.setBounds(150, 180, 173, 37);
			txtName.setFont(new Font("Helvetica", Font.PLAIN, 15));
			frame4.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			JLabel lblName = new JLabel("Name:");
			lblName.setFont(new Font("Helvetica", Font.BOLD, 18));
			lblName.setBounds(53, 187, 100, 16);
			frame4.getContentPane().add(lblName);
			
			txtYear = new JTextField();
			txtYear.setBounds(150, 290, 173, 37);
			txtYear.setFont(new Font("Helvetica", Font.PLAIN, 15));
			frame4.getContentPane().add(txtYear);
			txtYear.setColumns(10);
			
			JLabel lblGradYear = new JLabel("Grad Year:");
			lblGradYear.setFont(new Font("Helvetica", Font.BOLD, 18));
			lblGradYear.setBounds(40, 297, 100, 16);
			frame4.getContentPane().add(lblGradYear);
			
			JButton btnCreateNewStudent = new JButton("Create New Student");
			btnCreateNewStudent.setBounds(320, 400, 230, 37);
			btnCreateNewStudent.setFont(new Font("Helvetica", Font.BOLD, 15));
			frame4.getContentPane().add(btnCreateNewStudent);
			btnCreateNewStudent.addActionListener(new NewStud());
			
			ImageIcon image = new ImageIcon("hawk.png");
			JLabel imageLabel = new JLabel(image);
			imageLabel.setBounds(430, 120, 410, 259);
			frame4.getContentPane().add(imageLabel);
		}
		
		public class NewStud implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
			
				String SetID = txtId.getText();
				String SetName = txtName.getText();
				String grad = txtYear.getText();
				String maj = (String)comboBox.getSelectedItem();
				
				try {
					 String userHomeFolder = System.getProperty("user.home") + "\\" + "Desktop//Advising";
					 //System.out.println(userHomeFolder);
			         File major2 = new File(userHomeFolder, maj+".txt");
			         FileWriter fw = new FileWriter(new File(userHomeFolder, SetID+".txt"));
			         BufferedWriter outFile = new BufferedWriter(fw);
			         outFile.write(SetID+"\r\n"+SetName+"\r\n"+grad); 
			         outFile.write("\r\n"+major2);
			         outFile.close();
			     } catch (IOException ex) {
			     }
			
			
			}
			}
		
		}
		
	
	public class rtnStud implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			btnReturningStudent.setText("WORKED");
			
			frame1 = new JFrame();
			
			frame1.getContentPane().setBackground(Color.WHITE);
			frame1.setBounds(100, 100, 1072, 696);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.getContentPane().setLayout(null);
			frame1.setVisible(true);
			//Still need to create IDNum
			
			
			 textArea = new JTextArea(56,77);
			//textArea.setBounds(56, 77, 906, 474);
			//frame1.getContentPane().add(textArea);
			
		
			
			textField = new JTextField();
			textField.setBounds(120, 10, 116, 37);
			textField.setFont(new Font("Helvetica", Font.PLAIN, 20));
			frame1.getContentPane().add(textField);
			textField.setColumns(10);
			
			JScrollPane scroll = new JScrollPane (textArea);
			scroll.setSize(808, 517);
			scroll.setLocation(88, 57);
			scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
			 frame1.getContentPane().add(scroll);
			
			JLabel lblIdNumber = new JLabel("ID:");
			lblIdNumber.setForeground(Color.BLACK);
			lblIdNumber.setFont(new Font("Helvetica", Font.BOLD, 20));
			lblIdNumber.setBounds(90, 20, 27, 16);
			frame1.getContentPane().add(lblIdNumber);
			
			btnGrabClasses = new JButton("Grab Classes");
			btnGrabClasses.setBounds(250, 10, 173, 37);
			btnGrabClasses.setFont(new Font("Helvetica", Font.BOLD, 15));
			frame1.getContentPane().add(btnGrabClasses);
			btnGrabClasses.addActionListener(new load());
			btnGrabClasses.setActionCommand("enable");
			
			btnUpdateFile = new JButton("Update File");
			btnUpdateFile.setBounds(87, 587, 173, 37);
			btnUpdateFile.setFont(new Font("Helvetica", Font.BOLD, 15));
			frame1.getContentPane().add(btnUpdateFile);
			btnUpdateFile.addActionListener(new update());
			
			JButton btnPrint = new JButton("Print");
			btnPrint.setFont(new Font("Helvetica", Font.BOLD, 15));
			btnPrint.setBounds(722, 587, 173, 37);
			frame1.getContentPane().add(btnPrint);
			btnPrint.addActionListener( new Prin());
			//Still need to create IDN	
			
		}
		
				

		public class Prin implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
			
			try {
				textArea.print();
			} catch (PrinterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
			
		
		
				



	public class load implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		if("enable".equals(arg0.getActionCommand())) {
			
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
			 String userHomeFolder = System.getProperty("user.home") + "\\" + "Desktop//Advising";
			 //System.out.println(userHomeFolder);
			 FileWriter fw3 = new FileWriter(new File(userHomeFolder, IDNum+".txt"));
	         BufferedWriter outFile = new BufferedWriter(fw3);
	         outFile.write(textArea.getText()); 

	         outFile.close();
	     } catch (IOException ex) {
	     }



	}
		}
	

}	
	//New major screen
	public class major implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			frame2 = new JFrame();
			
			frame2.setBounds(100, 100, 976, 673);
			frame2.getContentPane().setBackground(Color.WHITE);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			frame2.setVisible(true);
			
			
	         
			table = new JTable(20,2);
			table.setBounds(216, 73, 481, 388);
			frame2.getContentPane().add(table);
			
			JLabel lblAddNewClasses = new JLabel("Add new classes");
			lblAddNewClasses.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblAddNewClasses.setBounds(362, 34, 179, 26);
			frame2.getContentPane().add(lblAddNewClasses);
			
			btnAddMajor = new JButton("ADD NEW MAJOR");
			btnAddMajor.setBounds(522, 532, 173, 37);
			btnAddMajor.setFont(new Font("Helvetica", Font.BOLD, 15));
			frame2.getContentPane().add(btnAddMajor);
			btnAddMajor.addActionListener(new createM());
			
			txtMajorname = new JTextField();
			txtMajorname.setBounds(205, 532, 300, 37);
			txtMajorname.setFont(new Font("Helvetica", Font.PLAIN, 20));
			frame2.getContentPane().add(txtMajorname);
			txtMajorname.setColumns(10);
			
			JLabel lblInsertMajorName = new JLabel("Insert Major Name:");
			lblInsertMajorName.setBounds(362, 480, 180, 22);
			lblInsertMajorName.setFont(new Font("Helvetica", Font.BOLD, 20));
			frame2.getContentPane().add(lblInsertMajorName);
		
		
		}
		
	}
	public class createM implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
		String major=txtMajorname.getText();
			
		try {
				 String userHomeFolder = System.getProperty("user.home") + "\\" + "Desktop//Advising";
				 //System.out.println(userHomeFolder);
		         File major1 = new File(userHomeFolder, major+".txt");
		         FileWriter fw = new FileWriter(major1.getAbsoluteFile());
		         BufferedWriter outFile = new BufferedWriter(fw);
		       //loop for jtable rows
	               for(int i = 0; i < table.getRowCount(); i++){
	                   //loop for jtable column
	                   for(int j = 0; j < table.getColumnCount(); j++){
	                       outFile.write(table.getModel().getValueAt(i, j)+" ");
	                       
	                   }
	                   outFile.write("\r\n");
	              
	               }
		         
		         

		         outFile.close();
		     } catch (IOException ex) {
		     }
			
		}
		}
}
//File file = new File("C:\\Users\\samsng\\Desktop\\folder\\Text.txt");
//FileWriter fw = new FileWriter(file.getAbsoluteFile());





//END