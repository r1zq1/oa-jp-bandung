package com.tokobuku.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyForm extends JFrame {
	private JTextField textField;
	public MyForm() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My GUI Form");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Submit");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hello " + textField.getText());
//			}
//		});
		
		btnNewButton.addActionListener(
			xxx -> {
				System.out.println("Hello " + textField.getText());
				textField.setText("");
			}
		);
		
		btnNewButton.setBounds(190, 197, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(43, 47, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(152, 44, 244, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		setSize(500, 300);
	}
	public static void main(String[] args) {
		new MyForm().setVisible(true);
	}
}
