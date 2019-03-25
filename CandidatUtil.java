import tc.TC;

public class CandidatUtil {

	public static Candidat[] read(String nomDuFichier) {
		TC.lectureDansFichier(nomDuFichier);
		int nbrecandidats = Integer.parseInt(TC.lireLigne());
		Candidat[] t = new Candidat[nbrecandidats] ;
		for (int i = 0 ; i < t.length ; i++) {
			t[i]= new Candidat(TC.lireLigne());
		}
		return t;
	}

	public static void printCandidatTable(Candidat[] data) {
		TC.println(data.length);

		for (int i = 0; i < data.length; i++) {
			TC.println(data[i]);
		}
	}

}
