public class SelectionSort implements SortingAlgorithm {

	Candidat[] table; // elements to sort
	CandidatComparator comparator; // defines the order
	
	public SelectionSort(Candidat[] table, CandidatComparator comparator) {
		this.table = table;
		this.comparator = comparator;
	}
	
	public void run() {
		for (int compteur =0 ; compteur <table.length; compteur++) {
			int indmin = compteur;
			for (int i = compteur+1 ; i < table.length ; i++) {
				int test = this.comparator.compare(table[indmin],table[i]);
				if (test>0) {
					indmin = i ;
					}		
			Candidat temp = table[compteur];
			table[compteur]=table[i];
			table[i]=temp;
			}
		}
	}
}
