package basic;

public class Trainer extends Persoana{

	public Trainer(String nume, String prenume, String oras, Integer varsta, boolean casatorita) {
		super(nume, prenume, oras, varsta, casatorita);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getResponsabilitati() {
		return "Pregatirea materialelor, evaluarea temelor, crearea contextului de lucru, raspunderea la intrebari";
	}

}