package comcave;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArtikelNeuWindow extends JFrame {
	
		JLabel lblBezeichnung;
		JLabel lblPreis;
		JLabel lblBestand;
		JLabel lblAnzahl;
		
		JTextField tfBezeichnung;
		JTextField tfPreis;
		JTextField tfAnzahl;
		
		JButton btnSpeichern;
		
		JPanel contentPane;
	
		public ArtikelNeuWindow() {
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setSize(600, 500);
			
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lblBezeichnung = new JLabel("Bezeichnung");
			lblPreis = new JLabel("Preis");
			lblAnzahl = new JLabel("Anzahl");
			tfBezeichnung = new JTextField();
			tfPreis = new JTextField();
			tfAnzahl = new JTextField();
			btnSpeichern = new JButton("speichern");
			
			contentPane.add(lblBezeichnung);
			contentPane.add(lblPreis);
			contentPane.add(lblAnzahl);
			contentPane.add(tfBezeichnung);
			contentPane.add(tfPreis);
			contentPane.add(tfAnzahl);
			contentPane.add(btnSpeichern);
			
			lblBezeichnung.setBounds(20, 20, 100, 25);;
			lblPreis.setBounds(20 , 55, 100, 25);
			lblAnzahl.setBounds(20 , 90, 100, 25);
			tfBezeichnung.setBounds(120, 20, 150, 25);
			tfPreis.setBounds(120, 55, 100, 25);
			tfAnzahl.setBounds(120, 90, 100, 25);
			btnSpeichern.setBounds(120, 125, 100, 25);
	
			//Schrift
			Font font = new Font("Calibri", Font.BOLD, 16);
			
			lblBezeichnung.setFont(font);
			lblPreis.setFont(font);
			lblAnzahl.setFont(font);
			tfBezeichnung.setFont(font);
			tfPreis.setFont(font);
			tfAnzahl.setFont(font);
			btnSpeichern.setFont(font);
			
			//Farbe
			
			Color color = new Color(0, 0, 255);
			lblBezeichnung.setForeground(color);
			lblPreis.setForeground(color);
			lblAnzahl.setForeground(color);
			
			// Background-Farbe
			tfBezeichnung.setBackground(color);
			 		
							
			
				
	}
	

	
}
