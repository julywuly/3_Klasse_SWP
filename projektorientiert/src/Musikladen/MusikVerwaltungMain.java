package Musikladen;

public class MusikVerwaltungMain {

	public static void main(String[] args) {
		MusikVerwaltung vw = new MusikVerwaltung();
		Interpret i1 = new Interpret("Hansi Hinterseer", 100);
		CD cd1 = new CD(i1);
		
		Song s1 = new Song("Die Berge sind so schön", 3*60);
		cd1.addSong(s1);
		
		Song s2 = new Song("Und Kitzbühel auch", 120);
		cd1.addSong(s2);
		
		vw.addCD(cd1);
		
		vw.ausgabe();
	}

}
