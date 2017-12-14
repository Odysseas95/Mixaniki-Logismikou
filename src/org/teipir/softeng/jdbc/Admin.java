package org.teipir.softeng.jdbc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Admin{
	
	private JFrame HospitalAdmin;
	
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.HospitalAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 Connection conn=null;
	 
public Admin() throws ClassNotFoundException, SQLException {
			
			conn=Sql_Con.dbConnector();
			
			initialize();
	}


private void initialize() {

	HospitalAdmin = new JFrame();
	HospitalAdmin.setTitle("HOSPITAL ADMIN");
	HospitalAdmin.setBounds(100, 100, 450, 300);
	HospitalAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	HospitalAdmin.setSize(800,600);
	HospitalAdmin.setResizable(false);
	
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
			HospitalAdmin.dispose();
		
		}
	});
}}

