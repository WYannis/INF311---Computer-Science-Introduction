public class CandidatNomComparator implements CandidatComparator {

	@Override
	public int compare(Candidat a, Candidat b) {
		String nom1 = a.nom ;
		String nom2 = b.nom ;
		int test = nom1.compareTo(nom2);
		return test;
		}

}
