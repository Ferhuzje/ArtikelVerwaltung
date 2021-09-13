package comcave;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ButtonKlick implements ActionListener{
	// 1. Datenbank-Server, Connector/Klassenbibliothek einbinden
			// Projekt Rechtsklick -> Build Path -> Configure Build Path -> Libraries -> Add external Jars
	// 2. Verbindung aufbauen
	// 3. Statement einfügen, SQL Statements/Befehle an den DB-Server senden 
	// 4. Verbindung schließen
	ArtikelNeuWindow w;
	
	public ButtonKlick(ArtikelNeuWindow w) {
		this.w = w;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String bez = w.tfBezeichnung.getText();
		String preis = w.tfPreis.getText();
		String anz = w.tfAnzahl.getText();
		
		try {
			String conString = "jdbc:mysql://localhost/javadb";
			String user = "muster";
			String password = "muster";
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();
			String sqlString = "INSERT INTO artikel (bezeichnung, preis, anzahl) VALUES('" 
					+ bez + "', " + preis + ", " + anz + ");";
			System.out.println(sqlString);
			stat.execute(sqlString);
			
			
			// Alle Artikel Daten abrufen 
			sqlString = "SELECT * FROM artikel;";
			ResultSet rs = stat.executeQuery(sqlString);
			while(rs.next()) {
				System.out.println( rs.getInt(1) + rs.getString(2) + rs.getDouble(3) + rs.getInt(4));
			}
			
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
 
}
