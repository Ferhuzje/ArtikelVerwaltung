package comcave;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArtikelAnzeigenWindow extends JFrame {

		JPanel contentPane;
		JTable table;
		JScrollPane scrollPane;
		DefaultTableModel model;
		
		public ArtikelAnzeigenWindow() {
			//Fenster
			//DISPOSE_ON_CLOSE
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setSize(600, 500);
			
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//Tabelle
			table = new JTable();
			scrollPane = new JScrollPane(table);
			model = new DefaultTableModel();
			
			contentPane.add(scrollPane);
			
			
			
		}
		
}
