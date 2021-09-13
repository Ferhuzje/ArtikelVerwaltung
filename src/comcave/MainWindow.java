package comcave;

import java.awt.Color;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

//import javax.swing.*;

public class MainWindow extends JFrame{
	
	JPanel contentPane;
	
	JMenuBar menuBar;
	JMenu menuArtikel;
	JMenuItem menuItemArtikelNeu;
	JMenuItem menuItemArtikelAnzeigen;
	
	//JMenu menuTest;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Artikelverwaltung V 1.0");
		setLayout(null);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		// Menue und Menupunkte 
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArtikel = new JMenu("Artikel");
		menuBar.add(menuArtikel);
		
		menuItemArtikelNeu = new JMenuItem("Neuen Artikel anlegen");
		menuItemArtikelAnzeigen = new JMenuItem("Allle Artikel anzeigen");
		
		menuArtikel.add(menuItemArtikelNeu);
		menuArtikel.add(menuItemArtikelAnzeigen);
		
		
		//ActionListenener
		 
		MenuKlick klick = new MenuKlick(this);
		menuItemArtikelNeu.addActionListener(klick);
		menuItemArtikelAnzeigen.addActionListener(klick);
		
		//Untermenue
		
		menuTest = new JMenu("Test");
		menuArtikel.add(menuTest);
		
			
	
		//Hintergrundfarbe setzen
		//contentPane.setBackground(Color.blue);
		
		//Bild auf PJPanel
		try {
			JLabel lblBackground = new JLabel( new ImageIcon( ImageIO.read(new File(".\\images\\bild.png"))));
			contentPane.add(lblBackground);
		} catch (Exception e) {
			 
		}
		//Icon des Fensters aendern
		setIconImage(new ImageIcon(".\\images\\icon.png").getImage());

	}
	
	public static void main(String[] args) {
		// Look and Feel
		
		//String lookAndFeel ="javax.swing.plaf.metal.MetalLookAnd Feel";
		/*
		String lookAndFeel ="javax.swing.plaf.nimbus.NimbusLookAndFeel";
		// external .jar eingebunden
		//String lookAndFeel = "com.jtatto.plaf.mint.MintLookAndFeel";
		
		
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		}
		catch (Exception e) {
			System.out.println("LookAndFeel-Error");
		}*/
				
		new MainWindow().setVisible(true);
		

	}

}
