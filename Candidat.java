import tc.TC;

public class Candidat {

	public String nom;
	public String prenom;
	public int note;
	public String numeroDeDossier;
	
	public Candidat(String nom, String prenom, int note, String numeroDeDossier) {
		this.nom=nom;
		this.prenom = prenom;
		this.note = note;
		this.numeroDeDossier = numeroDeDossier  ;
	}
	
	public Candidat(String ligne) { 
		String[] mots = TC.motsDeChaine(ligne);
		this.nom= mots[0];
		this.prenom = mots[1];
		this.note = Integer.parseInt(mots[2]);
		this.numeroDeDossier = mots[3];
	}
	
	public String toString() { 
		return this.nom + " " + this.prenom + " " + this.note + " " + this.numeroDeDossier;
	}
	
}