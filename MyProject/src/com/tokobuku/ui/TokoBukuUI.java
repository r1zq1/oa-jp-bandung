package com.tokobuku.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.tokobuku.domain.BukuMemoryImpl;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TokoBukuUI extends JFrame{
	private JTextField tfNomor;
	private JTextField tfJudul;
	private JTextField tfPengarang;
	private JTable table;
	private BukuMemoryImpl helper;
	public TokoBukuUI() {
		helper = new BukuMemoryImpl();
		setResizable(false);
		setTitle("Toko Buku App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 448, 250);
		getContentPane().add(tabbedPane);
		
		JPanel panelInput = new JPanel();
		tabbedPane.addTab("Form Input Buku", null, panelInput, null);
		panelInput.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nomor");
		lblNewLabel.setBounds(28, 24, 46, 14);
		panelInput.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Judul Buku");
		lblNewLabel_1.setBounds(28, 59, 51, 8);
		panelInput.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pengarang");
		lblNewLabel_2.setBounds(28, 93, 69, 14);
		panelInput.add(lblNewLabel_2);
		
		tfNomor = new JTextField();
		tfNomor.setBounds(130, 21, 86, 20);
		panelInput.add(tfNomor);
		tfNomor.setColumns(10);
		
		tfJudul = new JTextField();
		tfJudul.setBounds(130, 53, 247, 20);
		panelInput.add(tfJudul);
		tfJudul.setColumns(10);
		
		tfPengarang = new JTextField();
		tfPengarang.setBounds(130, 90, 247, 20);
		panelInput.add(tfPengarang);
		tfPengarang.setColumns(10);
		
		JButton btnTambah = new JButton("Tambah");
//		btnTambah.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("click")
//			}
//		});
		btnTambah.addActionListener(e -> System.out.println("click"));
		
		btnTambah.setBounds(28, 138, 100, 25);
		panelInput.add(btnTambah);
		
		JButton btnCari = new JButton("Cari");
		btnCari.setBounds(126, 138, 100, 25);
		panelInput.add(btnCari);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(225, 138, 100, 25);
		panelInput.add(btnUpdate);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setBounds(330, 138, 89, 23);
		panelInput.add(btnHapus);		
		
		Object rowData[][] = helper.getSemuaDataBuku();
		Object columnNames[] = helper.getPropertiBuku();

		table = new JTable(rowData, columnNames);
		table.setBounds(110, 49, 225, 32);

		JScrollPane panelDisplay = new JScrollPane(table);
		tabbedPane.addTab("Daftar Semua Buku", null, panelDisplay, null);
		
		setSize(450, 276);
	}
}