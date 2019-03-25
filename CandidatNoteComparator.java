public class CandidatNoteComparator implements CandidatComparator {

	@Override
	public int compare(Candidat c1, Candidat c2) {
		int note1 = c1.note ;
		int note2 = c2.note;
		int comp = 0;
		if (note1 < note2) {
			comp =-2;
		}
		else if (note1 > note2) {
			comp =  2;
		}
		return comp;
		
	}

}
