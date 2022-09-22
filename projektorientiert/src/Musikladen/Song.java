package Musikladen;

public class Song {
	private String titel;
	private int laenge;
	
	public Song(String titel, int laenge) {
		super();
		this.titel = titel;
		this.laenge = laenge;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	
	public void ausgabe()
	{
		System.out.printf("* %s (%d sek)\n", titel, laenge);
	}
}
