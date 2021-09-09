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

public class MainWindow extends JFrame{
	
	JPanel contentPane;
	JMenuBar menuBar;
	JMenu menuArtikel;
	JMenuItem menuItemArtikelNeu;
	JMenuItem menuItemArtikelAnzeigen;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Artikelverwaltung V 1.0");
		setLayout(null);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArtikel = new JMenu("Artikel");
		menuBar.add(menuArtikel);
		
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
		new MainWindow().setVisible(true);
		

	}

}
