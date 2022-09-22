package Musikladen;

public class Interpret {
	private String name;
	private int jahr;
	
	public Interpret(String name, int jahr) {
		super();
		this.name = name;
		this.jahr = jahr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public void ausgabe()
	{
		System.out.printf("%s (%d)\n", name, jahr);
	}
}
