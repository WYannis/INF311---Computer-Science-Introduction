public class MergeSort implements SortingAlgorithm {

	Candidat[] table; // elements to sort
	CandidatComparator comparator; // defines the order
	Candidat[] tmp;
	
	public MergeSort(Candidat[] table, CandidatComparator comparator) {
		this.table = table;
		this.comparator = comparator;
		this.tmp = new Candidat[table.length];
	}
	
	public void run() {
		// to complete
	}
	
	public void merge(int left, int middle, int right) {
		// to complete
	}
	
}
