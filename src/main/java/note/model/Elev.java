package note.model;

public class Elev {
	private int nrmatricol;
	private String nume;
	
	public Elev(int nrmatricol, String nume) {
		this.setNrmatricol(nrmatricol);
		this.setNume(nume);
	}

	public int getNrmatricol() {
		return nrmatricol;
	}

	public void setNrmatricol(int nrmatricol) {
		this.nrmatricol = nrmatricol;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public String toString() {
		return this.nrmatricol + " " + this.nume;
	}
	
}
