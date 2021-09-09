package comcave;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	
	JPanel contenPane;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Artikelverwaltung V 1.0");
		setLayout(null);
		new MainWindow().setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow().setVisible(true);
		

	}

}
