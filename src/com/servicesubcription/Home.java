package com.servicesubcription;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;
	JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	TreeMapStorage tmap = new TreeMapStorage();
	private JTextField textField_2;
	private JTable table;
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
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmap.deleteDetails(textField_2.getText());
			}
		});
		btnDelete.setBounds(212, 94, 89, 23);
		panel_2.add(btnDelete);
		
		JLabel lblAllUsers = new JLabel("All  Users");
		lblAllUsers.setForeground(SystemColor.inactiveCaptionBorder);
		lblAllUsers.setBounds(188, 172, 70, 14);
		panel_2.add(lblAllUsers);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(362, 163, 89, 23);
		panel_2.add(btnRefresh);
		
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
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(223, 108, 89, 23);
		panel_1.add(btnSearch);
		
		JButton btnBack = new JButton("Back");
		
		btnBack.setBounds(362, 0, 89, 23);
		panel_1.add(btnBack);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(84, 142, 48, 14);
		panel_1.add(lblEdit);
		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.DARK_GRAY);
//		layeredPane.add(panel, "name_885622712854300");
//		panel.setLayout(null);
//		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 241, 441, 100);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(SystemColor.activeCaption);
		scrollPane.setViewportView(table);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmap.addDetails(textField.getText(), textField_1.getText());
				table.setModel(tmap.getData());
				
				
			}
		});		
	}
}
