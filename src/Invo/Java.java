package Invo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Java {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField jtxtTotal;
	private JTextField jtxtChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java window = new Java();
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
	public Java() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 71, 644, 469);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn7_1 = new JButton("");
		jbtn7_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7_1.setBounds(30, 26, 270, 210);
		panel.add(jbtn7_1);
		
		JButton jbtn7_1_1 = new JButton("");
		jbtn7_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7_1_1.setBounds(340, 26, 270, 210);
		panel.add(jbtn7_1_1);
		
		JButton jbtn7_1_2 = new JButton("");
		jbtn7_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtn7_1_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7_1_2.setBounds(340, 247, 270, 210);
		panel.add(jbtn7_1_2);
		
		JButton jbtn7_1_3 = new JButton("");
		jbtn7_1_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7_1_3.setBounds(30, 247, 270, 210);
		panel.add(jbtn7_1_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(1058, 71, 366, 469);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7.setBounds(23, 80, 92, 86);
		panel_1.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn8.setBounds(138, 80, 92, 86);
		panel_1.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn9.setBounds(249, 80, 92, 86);
		panel_1.add(jbtn9);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn4.setBounds(23, 177, 92, 86);
		panel_1.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn5.setBounds(138, 177, 92, 86);
		panel_1.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn6.setBounds(249, 177, 92, 86);
		panel_1.add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn1.setBounds(23, 275, 92, 86);
		panel_1.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn2.setBounds(138, 275, 92, 86);
		panel_1.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn3.setBounds(249, 275, 92, 86);
		panel_1.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn0.setBounds(23, 372, 92, 86);
		panel_1.add(jbtn0);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_10.setBounds(138, 372, 92, 86);
		panel_1.add(btnNewButton_10);
		
		JButton jbtnC = new JButton("C");
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnC.setBounds(249, 372, 92, 86);
		panel_1.add(jbtnC);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 564, 1414, 186);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(45, 32, 112, 72);
		panel_2.add(lblNewLabel);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(167, 37, 210, 56);
		panel_2.add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblChange.setBounds(28, 104, 147, 72);
		panel_2.add(lblChange);
		
		JLabel lblPayMethod = new JLabel("Pay Method");
		lblPayMethod.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPayMethod.setBounds(402, 69, 188, 72);
		panel_2.add(lblPayMethod);
		
		jtxtChange = new JTextField();
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(167, 108, 210, 56);
		panel_2.add(jtxtChange);
		
		JComboBox jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Gcash", "Paymaya", "PayPal"}));
		jcboPayment.setFont(new Font("Tahoma", Font.BOLD, 25));
		jcboPayment.setBounds(598, 82, 197, 49);
		panel_2.add(jcboPayment);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnPay.setBounds(957, 21, 131, 72);
		panel_2.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnPrint.setBounds(1107, 21, 131, 72);
		panel_2.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnReset.setBounds(1257, 21, 131, 72);
		panel_2.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnRemove.setBounds(957, 104, 249, 72);
		panel_2.add(jbtnRemove);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnExit.setBounds(1230, 104, 158, 72);
		panel_2.add(jbtnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(670, 71, 375, 390);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Item", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(0).setMinWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(670, 472, 376, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 11, 644, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(670, 11, 754, 54);
		frame.getContentPane().add(button);
	}
}
