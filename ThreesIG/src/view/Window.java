package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextField;

public class Window {

	private JFrame frame;
	private final JTable table = new JTable();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(86, 111, 59, 32);
		frame.getContentPane().add(lblNewLabel);
		table.setFillsViewportHeight(true);
		table.setToolTipText("jhj\r\n");
		table.setBounds(132, 72, 220, 109);
		frame.getContentPane().add(table);
		
		textField = new JTextField();
		textField.setBounds(137, 80, 36, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
