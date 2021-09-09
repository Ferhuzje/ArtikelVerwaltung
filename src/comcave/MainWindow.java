package comcave;

import java.awt.Color;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	
	JPanel contentPane;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Artikelverwaltung V 1.0");
		setLayout(null);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		//Hintergrundfarbe setzen
		//contentPane.setBackground(Color.blue);
		
		//Bild auf PJPanel
		try {
			JLabel lblBackground = new JLabel( new ImageIcon( ImageIO.read(new File(".\\images\\bild.png"))));
			contentPane.add(lblBackground);
		} catch (Exception e) {
			 
		}

	}
	
	public static void main(String[] args) {
		new MainWindow().setVisible(true);
		

	}

}
