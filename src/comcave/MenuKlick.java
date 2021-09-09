package comcave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuKlick implements ActionListener {
	
	MainWindow w;
	
	public MenuKlick(MainWindow w) {
		this.w = w;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(w.menuItemArtikelNeu)) {
			
		}
		else if(e.getSource().equals(w.menuItemArtikelAnzeigen)) {
			
		}
	}

}
