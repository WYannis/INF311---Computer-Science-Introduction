import java.util.Arrays;

public class CountingSort implements SortingAlgorithm {

	Candidat[] a;
	Candidat[]	b;
	int[] count;
	CountingSortAdapter adapter;
	
	
	public CountingSort(Candidat[] data, CountingSortAdapter adapter) {
		this.a = data;
		this.adapter = adapter;
		this.b = Arrays.copyOf(data, data.length);
		this.count = new int[adapter.getNumberOfSortableValues()];
	}
	
	@Override
	public void run() {
		// to complete
	}

}
