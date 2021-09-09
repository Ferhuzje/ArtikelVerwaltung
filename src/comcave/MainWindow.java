package comcave;

import java.awt.Color;
import javax.swing.JFrame;
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

	}
	
	public static void main(String[] args) {
		new MainWindow().setVisible(true);
		

	}

}
