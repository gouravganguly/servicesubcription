package com.servicesubcription;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.Color;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	TreeMapStorage tmap = new TreeMapStorage();
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
		setBounds(100, 100, 524, 403);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(26, 37, 451, 186);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel.setBackground(SystemColor.desktop);
		layeredPane.add(panel, "name_885622712854300");
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.desktop);
		layeredPane.add(panel_2, "name_577823999007700");
		panel_2.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setForeground(SystemColor.inactiveCaptionBorder);
		lblAdmin.setBounds(193, 5, 65, 14);
		panel_2.add(lblAdmin);
		
		JButton btnBack_1 = new JButton("Back");
		
		btnBack_1.setBounds(362, 1, 89, 23);
		panel_2.add(btnBack_1);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setForeground(SystemColor.inactiveCaptionBorder);
		lblUsername.setBounds(71, 48, 77, 14);
		panel_2.add(lblUsername);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 45, 96, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSearch_1 = new JButton("Search");
		
		btnSearch_1.setBounds(108, 94, 89, 23);
		panel_2.add(btnSearch_1);
		
		JButton btnDelete = new JButton("Delete");
		
		btnDelete.setBounds(212, 94, 89, 23);
		panel_2.add(btnDelete);
		
		JLabel lblAllUsers = new JLabel("All  Users");
		lblAllUsers.setForeground(SystemColor.inactiveCaptionBorder);
		lblAllUsers.setBounds(188, 172, 70, 14);
		panel_2.add(lblAllUsers);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(tmap.getData());
			}
		});
		btnRefresh.setBounds(362, 163, 89, 23);
		panel_2.add(btnRefresh);
		
		JLabel lblAdminError = new JLabel("");
		lblAdminError.setForeground(Color.RED);
		lblAdminError.setBounds(137, 147, 186, 14);
		panel_2.add(lblAdminError);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.desktop);
		layeredPane.add(panel_1, "name_885649993561400");
		panel_1.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Customer");
		lblRegistration.setForeground(SystemColor.inactiveCaptionBorder);
		lblRegistration.setBounds(177, 11, 60, 14);
		panel_1.add(lblRegistration);
		
		JLabel lblEmailId = new JLabel("UserName");
		lblEmailId.setForeground(SystemColor.inactiveCaptionBorder);
		lblEmailId.setBounds(61, 43, 71, 14);
		panel_1.add(lblEmailId);
		
		textField = new JTextField();
		textField.setBounds(157, 40, 96, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblSubscriptions = new JLabel("Add Subscription");
		lblSubscriptions.setForeground(SystemColor.inactiveCaptionBorder);
		lblSubscriptions.setBounds(47, 80, 100, 14);
		panel_1.add(lblSubscriptions);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 71, 96, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnView = new JButton("Add");
		
		btnView.setBounds(124, 108, 89, 23);
		panel_1.add(btnView);
		
		JButton btnBack = new JButton("Back");
		
		btnBack.setBounds(362, 0, 89, 23);
		panel_1.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Edit User");
		
		btnNewButton_1.setBounds(226, 108, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblcustError = new JLabel("");
		lblcustError.setForeground(Color.RED);
		lblcustError.setBounds(124, 161, 229, 14);
		panel_1.add(lblcustError);
		
		JLabel lblLogin = new JLabel("Home");
		lblLogin.setForeground(SystemColor.inactiveCaptionBorder);
		lblLogin.setBounds(198, 5, 71, 14);
		panel.add(lblLogin);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				table.setModel(tmap.getData());
			}
		});
		btnNewButton.setBounds(237, 76, 111, 23);
		panel.add(btnNewButton);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnCustomer.setBounds(90, 76, 111, 23);
		panel.add(btnCustomer);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		layeredPane.add(panel_3, "name_14718061669900");
		panel_3.setLayout(null);
		
		JLabel lblEditCustomer = new JLabel("Edit Customer");
		lblEditCustomer.setBounds(191, 5, 115, 14);
		panel_3.add(lblEditCustomer);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.desktop);
		panel_4.setBounds(0, 38, 217, 148);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblEditUsername = new JLabel("Edit UserName");
		lblEditUsername.setForeground(SystemColor.inactiveCaptionBorder);
		lblEditUsername.setBounds(42, 5, 105, 14);
		panel_4.add(lblEditUsername);
		
		JLabel lblUsername_1 = new JLabel("UserName");
		lblUsername_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblUsername_1.setBounds(10, 33, 86, 14);
		panel_4.add(lblUsername_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 30, 96, 20);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		JLabel lblNewUsername = new JLabel("New UserName");
		lblNewUsername.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewUsername.setBounds(10, 58, 86, 14);
		panel_4.add(lblNewUsername);
		
		textField_4 = new JTextField();
		textField_4.setBounds(91, 55, 96, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		
		btnUpdate.setBounds(91, 83, 96, 23);
		panel_4.add(btnUpdate);
		
		JLabel lblEditUserError = new JLabel("");
		lblEditUserError.setForeground(Color.RED);
		lblEditUserError.setBounds(10, 123, 197, 14);
		panel_4.add(lblEditUserError);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.desktop);
		panel_5.setBounds(221, 38, 230, 148);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblEditSubscriptions = new JLabel("Delete Subscriptions");
		lblEditSubscriptions.setForeground(SystemColor.inactiveCaptionBorder);
		lblEditSubscriptions.setBounds(68, 5, 133, 14);
		panel_5.add(lblEditSubscriptions);
		
		JLabel lblUsername_2 = new JLabel("UserName");
		lblUsername_2.setForeground(SystemColor.inactiveCaptionBorder);
		lblUsername_2.setBounds(10, 30, 73, 14);
		panel_5.add(lblUsername_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(93, 27, 96, 20);
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setBounds(93, 52, 96, 20);
		panel_5.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSubsciption = new JLabel("Subsciption");
		lblSubsciption.setForeground(SystemColor.inactiveCaptionBorder);
		lblSubsciption.setBounds(10, 55, 73, 14);
		panel_5.add(lblSubsciption);
		
		JButton btnDelete_1 = new JButton("Delete");
		
		btnDelete_1.setBounds(93, 83, 89, 23);
		panel_5.add(btnDelete_1);
		
		JLabel lblEditCustError = new JLabel("");
		lblEditCustError.setForeground(Color.RED);
		lblEditCustError.setBounds(52, 123, 149, 14);
		panel_5.add(lblEditCustError);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				table.setModel(tmap.resetTable());
				textField_4.setText("");
				textField_6.setText("");
			}
		});
		btnBack_2.setBounds(362, 1, 89, 23);
		panel_3.add(btnBack_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 241, 441, 100);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(SystemColor.activeCaption);
		scrollPane.setViewportView(table);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				lblcustError.setText("");
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				table.setModel(tmap.resetTable());
			}
		});
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblAdminError.setText("");
				textField_2.setText("");
				table.setModel(tmap.resetTable());
				
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcustError.setText("");
				if(textField.getText().isEmpty()) {
					lblcustError.setText("UserName cannot be Empty");
				} else if(textField_1.getText().isEmpty()) {
					lblcustError.setText("Subscription cannot be Empty");
				} else {
					boolean isInserted = tmap.addDetails(textField.getText(), textField_1.getText());
					if(isInserted) {
						table.setModel(tmap.searchData(textField.getText()));
						textField.setText("");
						textField_1.setText("");
					} else {
						lblcustError.setText("Subscription already present");	
					}
					
				}
				
			}
		});		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcustError.setText("");
				if(!textField.getText().isEmpty()) {
					if(tmap.checkUser(textField.getText())) {
						layeredPane.removeAll();
						layeredPane.add(panel_3);
						layeredPane.repaint();
						layeredPane.revalidate();
						
						textField_3.setText(textField.getText());
						textField_5.setText(textField.getText());
						table.setModel(tmap.searchData(textField.getText()));
						textField.setText("");
						textField_1.setText("");
					} else {
						lblcustError.setText("UserName not Present");
					}
				} else {
					lblcustError.setText("UserName cannot be Empty");	
				}	
			}
		});
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEditCustError.setText("");
				boolean deleted = tmap.deleteSubscription(textField_5.getText(), textField_6.getText());
				if(deleted) {
					table.setModel(tmap.searchData(textField_5.getText()));
					textField_5.setText("");
					textField_6.setText("");
				} else {
					lblEditCustError.setText("Subscription not present");
				}
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEditCustError.setText("");
				lblEditUserError.setText("");
				if(textField_4.getText().isEmpty()) {	
					lblEditUserError.setText("New UserName cannot be Empty");
				} else {
					tmap.editUserName(textField_3.getText(), textField_4.getText());
					table.setModel(tmap.searchData(textField_4.getText()));
					textField_3.setText(textField_4.getText());
					textField_5.setText(textField_4.getText());
					textField_4.setText("");
				}
			}
		});
		
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAdminError.setText("");
				if(textField_2.getText().isEmpty()) {
					lblAdminError.setText("UserName cannot be Empty");
				} else if(tmap.checkUser(textField_2.getText())) {
					table.setModel(tmap.searchData(textField_2.getText()));
					textField_2.setText("");
				} else 
					lblAdminError.setText("UserName not present");
				
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAdminError.setText("");
				if(textField_2.getText().isEmpty()) {
					lblAdminError.setText("UserName cannot be Empty");
				} else {
					LinkedHashSet<String> val = tmap.deleteDetails(textField_2.getText());
					if(val==null) {
						lblAdminError.setText("UserName not present");
					} else {
						table.setModel(tmap.getData());
						textField_2.setText("");
					}
				}
				
				
			}
		});
	}
}
