package fileWriter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TestAddMajor {

	private JFrame frame;
	private JTable table;
	private JButton btnAddNewMajor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAddMajor window = new TestAddMajor();
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
	public TestAddMajor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 976, 673);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable(20,2);
		table.setBounds(216, 73, 481, 388);
		frame.getContentPane().add(table);
		TableColumn column = null;
		for (int i = 0; i < 5; i++) {
		    column = table.getColumnModel().getColumn(i);
		    if (i == 3) {
		        column.setPreferredWidth(100); //third column is bigger
		    } else {
		        column.setPreferredWidth(50);
		    }
		}
		
		
		
		JLabel lblAddNewClasses = new JLabel("Add new classes");
		lblAddNewClasses.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddNewClasses.setBounds(362, 34, 179, 26);
		frame.getContentPane().add(lblAddNewClasses);
		
		btnAddNewMajor = new JButton("ADD NEW MAJOR");
		btnAddNewMajor.setBounds(404, 532, 153, 26);
		frame.getContentPane().add(btnAddNewMajor);
		
		
	}
}
