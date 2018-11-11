package fileWriter;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fileWriter.WHOLEthing.createM;

import javax.swing.JButton;

public class NewStundent {

	private JFrame frame4;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtYear;
public JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStundent window = new NewStundent();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewStundent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame4.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 873, 564);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(521, 70, 264, 22);
		frame4.getContentPane().add(comboBox);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setBounds(434, 73, 56, 16);
		frame4.getContentPane().add(lblMajor);
		
		txtId = new JTextField();
		txtId.setBounds(143, 70, 116, 22);
		frame4.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblStudentid = new JLabel("StudentID");
		lblStudentid.setBounds(63, 73, 56, 16);
		frame4.getContentPane().add(lblStudentid);
		
		txtName = new JTextField();
		txtName.setBounds(143, 120, 116, 22);
		frame4.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(63, 123, 56, 16);
		frame4.getContentPane().add(lblName);
		
		txtYear = new JTextField();
		txtYear.setBounds(143, 174, 116, 22);
		frame4.getContentPane().add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblGradYear = new JLabel("Grad Year");
		lblGradYear.setBounds(63, 177, 68, 16);
		frame4.getContentPane().add(lblGradYear);
		
		JButton btnCreateNewStudent = new JButton("Create New Student");
		btnCreateNewStudent.setBounds(521, 257, 172, 25);
		frame4.getContentPane().add(btnCreateNewStudent);
		btnCreateNewStudent.addActionListener(new NewStud());
	}
	public class NewStud implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
		
			String SetID = txtId.getText();
			String SetName = txtName.getText();
			String grad = txtYear.getText();
			String maj = (String) comboBox.getSelectedItem();
			
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
