package org.teipir.softeng.jdbc;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;





import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.HeadlessException;

public class Admin {

	private JFrame frmHospitalAdmin;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.frmHospitalAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn=null;
	static JTable table;
	private JTextField textFieldUsr;
	private JTextField textFieldPass;
	private JTextField textFieldAmka;
	private JTextField textFieldamka2;
	private JTextField textFieldUsr1;
	private JTextField textFieldPas2;
	private JTextField textFieldAmka2;
	
	
	
	
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Admin() throws ClassNotFoundException, SQLException {
		
		conn=Sql_Con.dbConnector();
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmHospitalAdmin = new JFrame();
		frmHospitalAdmin.setTitle("HOSPITAL ADMIN");
		frmHospitalAdmin.setBounds(100, 100, 450, 300);
		frmHospitalAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHospitalAdmin.setSize(800,600);
		frmHospitalAdmin.setResizable(false);
		
		
		
		final JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 794, 571);
		
		final JPanel panelUsers = new JPanel();
		panelUsers.setBounds(0, 0, 794, 571);
		
		final JPanel panelDelete = new JPanel();
		panelDelete.setBounds(0, 0, 794, 571);
		
		final JPanel panelAdd = new JPanel();
		panelAdd.setBounds(0, 0, 794, 571);
		
		final JPanel panelManage = new JPanel();
		panelManage.setBounds(0, 0, 794, 571);
		
		panelMenu.setVisible(true);
		panelUsers.setVisible(false);
		panelDelete.setVisible(false);
		panelAdd.setVisible(false);
		panelManage.setVisible(false);

		
		JButton btnExit = new JButton("\u0395\u039E\u039F\u0394\u039F\u03A3");
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnExit.setBounds(325, 505, 150, 45);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHospitalAdmin.dispose();
				Login.main(null);
			}
		});
		
		JButton btnUser = new JButton("\u03A7\u03A1\u0397\u03A3\u03A4\u0395\u03A3");
		btnUser.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnUser.setBounds(325, 11, 150, 45);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelUsers.setVisible(true);
				panelMenu.setVisible(false);
				try{
					AdminC.Admin_users();					
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		});
		
		
		JButton btnNewUser = new JButton("\u039D\u0395\u039F\u03A3 \u03A7\u03A1\u0397\u03A3\u03A4\u0397\u03A3");
		btnNewUser.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewUser.setBounds(10, 505, 150, 45);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsers.setVisible(false);
				panelAdd.setVisible(true);
			}
		});
		
		JButton buttonManage = new JButton("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		buttonManage.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonManage.setBounds(624, 505, 150, 45);
		buttonManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsers.setVisible(false);
				panelManage.setVisible((true));
				
			}
		});
		
		JButton buttonBack = new JButton("\u03A0\u0399\u03A3\u03A9");
		buttonBack.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonBack.setBounds(624, 11, 150, 45);
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsers.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		
		JLabel label = new JLabel("\u03A7\u03A1\u0397\u03A3\u03A4\u0395\u03A3");
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(325, 11, 150, 45);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 764, 419);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		
		JButton buttonDelete = new JButton("ΔΙΑΓΡΑΦΗ");
		buttonDelete.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonDelete.setBounds(325, 505, 150, 45);
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDelete.setVisible(true);
				panelUsers.setVisible(false);
			}
		});
		
				
		JLabel label_1 = new JLabel("ΑΜΚΑ");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(130, 285, 170, 30);
		
		textFieldamka2 = new JTextField();
		textFieldamka2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldamka2.setBounds(315, 285, 170, 30);
		textFieldamka2.setColumns(10);
		
		JButton buttonDelete2 = new JButton("ΔΙΑΓΡΑΦΗ");
		buttonDelete2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonDelete2.setBounds(624, 505, 150, 45);
		buttonDelete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amk = textFieldamka2.getText();
				if(amk.length()==0){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
						} else{	
					       try {
							AdminC.Admin_Dlt(amk);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}}
								
								
							
					
						
				
				textFieldamka2.setText("");
				try {
					General.refresh();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panelDelete.setVisible(false);
				panelUsers.setVisible(true);
			}
		});
		
		JButton buttonback2 = new JButton("ΠΙΣΩ");
		buttonback2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonback2.setBounds(624, 11, 150, 45);
		buttonback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelDelete.setVisible(false);
				panelUsers.setVisible(true);
			}
		});
		
		JLabel label_6 = new JLabel("ΔΙΑΓΡΑΦΗ ΧΡΗΣΤΗ");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_6.setBounds(290, 11, 220, 45);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		frmHospitalAdmin.getContentPane().setLayout(null);
		
		
		panelAdd.setVisible(false);
		
		
		JButton btnBack2 = new JButton("\u03A0\u0399\u03A3\u03A9");
		btnBack2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBack2.setBounds(624, 11, 150, 45);
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAdd.setVisible(false);
				panelUsers.setVisible(true);
			}
		});
		
		JButton buttonSave = new JButton("\u0391\u03A0\u039F\u0398\u0397\u039A\u0395\u03A5\u03A3\u0397");
		buttonSave.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSave.setBounds(624, 505, 150, 45);
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usr = textFieldUsr.getText();
				String pas = textFieldPass.getText();
				String amka = textFieldAmka.getText();				
				if( usr.length()==0||pas.length()==0||amka.length()==0){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				}else{
						try {
							AdminC.Admin_add(usr, pas, amka);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
									
					
					
				textFieldUsr.setText("");
				textFieldPass.setText("");
				textFieldAmka.setText("");
				
				try {
					General.refresh();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panelUsers.setVisible(true);
				panelAdd.setVisible(false);
			}
		});
		
		
		panelManage.setVisible(false);
		
				
		textFieldUsr1 = new JTextField();
		textFieldUsr1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldUsr1.setBounds(241, 87, 170, 30);
		textFieldUsr1.setColumns(10);
		
		JLabel label_2 = new JLabel("USERNAME");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_2.setBounds(10, 87, 170, 30);
		
		JLabel label_3 = new JLabel("PASSWORD");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_3.setBounds(10, 163, 170, 30);
		
		textFieldPas2 = new JTextField();
		textFieldPas2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldPas2.setBounds(241, 163, 170, 30);
		textFieldPas2.setColumns(10);
		
		textFieldAmka2 = new JTextField();
		textFieldAmka2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldAmka2.setBounds(241, 251, 170, 30);
		textFieldAmka2.setColumns(10);
		
		JLabel label_4 = new JLabel("AMKA");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_4.setBounds(10, 251, 170, 30);
		
		JButton buttonSave2 = new JButton("ΑΠΟΘΗΚΕΥΣΗ");
		buttonSave2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonSave2.setBounds(624, 505, 150, 45);
		buttonSave2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usr= textFieldUsr1.getText();
				String pas= textFieldPas2.getText();
				String amk= textFieldAmka2.getText();
				if( usr.length()==0||pas.length()==0||amk.length()==0){
					JOptionPane.showMessageDialog(null, "ΚΕΝΟ ΠΕΔΙΟ");
				} else{	
						
						
							
								try {
									AdminC.Admin_upt(usr, pas, amk);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							
				}
						
				
				try {
					General.refresh();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panelManage.setVisible(false);
				panelUsers.setVisible(true);
				textFieldUsr1.setText("");
				textFieldPas2.setText("");
				textFieldAmka2.setText("");
			}
		});
		
		JButton buttonBack3 = new JButton("ΠΙΣΩ");
		buttonBack3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonBack3.setBounds(624, 11, 150, 45);
		buttonBack3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelManage.setVisible(false);
				panelUsers.setVisible(true);
			}
		});
		panelManage.setLayout(null);
		
		JLabel label_7 = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΧΡΗΣΤΗ");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_7.setBounds(290, 11, 220, 45);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panelManage.add(label_7);
		panelManage.add(buttonBack3);
		panelManage.add(label_2);
		panelManage.add(textFieldUsr1);
		panelManage.add(label_3);
		panelManage.add(textFieldPas2);
		panelManage.add(label_4);
		panelManage.add(textFieldAmka2);
		panelManage.add(buttonSave2);
		frmHospitalAdmin.getContentPane().add(panelManage);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUsername.setBounds(20, 87, 170, 30);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPassword.setBounds(20, 163, 170, 30);
		
		JLabel lblAmka = new JLabel("AMKA");
		lblAmka.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAmka.setBounds(20, 251, 170, 30);
		
		textFieldUsr = new JTextField();
		textFieldUsr.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldUsr.setBounds(251, 87, 170, 30);
		textFieldUsr.setColumns(10);
		
		textFieldPass = new JTextField();
		textFieldPass.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldPass.setBounds(251, 163, 170, 30);
		textFieldPass.setColumns(10);
		
		textFieldAmka = new JTextField();
		textFieldAmka.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldAmka.setBounds(251, 251, 170, 30);
		textFieldAmka.setColumns(10);
		
		JLabel label_5 = new JLabel("ΝΕΟΣ ΧΡΗΣΤΣΗΣ");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_5.setBounds(300, 11, 200, 45);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panelAdd.setLayout(null);
		panelAdd.add(label_5);
		panelAdd.add(btnBack2);
		panelAdd.add(lblUsername);
		panelAdd.add(textFieldUsr);
		panelAdd.add(lblPassword);
		panelAdd.add(textFieldPass);
		panelAdd.add(lblAmka);
		panelAdd.add(textFieldAmka);
		panelAdd.add(buttonSave);
		frmHospitalAdmin.getContentPane().add(panelAdd);
		frmHospitalAdmin.getContentPane().add(panelDelete);
		panelDelete.setLayout(null);
		panelDelete.add(label_6);
		panelDelete.add(buttonback2);
		panelDelete.add(label_1);
		panelDelete.add(textFieldamka2);
		panelDelete.add(buttonDelete2);
		frmHospitalAdmin.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		panelMenu.add(btnUser);
		panelMenu.add(btnExit);
		frmHospitalAdmin.getContentPane().add(panelUsers);
		panelUsers.setLayout(null);
		panelUsers.add(label);
		panelUsers.add(buttonBack);
		panelUsers.add(scrollPane);
		panelUsers.add(btnNewUser);
		panelUsers.add(buttonDelete);
		panelUsers.add(buttonManage);
		
	}
}
