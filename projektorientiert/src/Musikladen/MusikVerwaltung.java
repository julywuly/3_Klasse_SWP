package Musikladen;

import java.util.ArrayList;

public class MusikVerwaltung {
	private ArrayList<CD> cds = new ArrayList<>();
	
	public void addCD(CD cd)
	{
		cds.add(cd);
	}
	
	public void removeCD(int position)
	{

		cds.remove(position);
	}
	
	public void ausgabe()
	{

		for (CD cd : cds) {
			cd.ausgabe();
		}
	}
}
