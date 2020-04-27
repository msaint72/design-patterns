package structural.adapter;

public class Client {
	public static void main(String[] args) {
		int[] numbers = new int[] { 34, 2, 4, 12, 1 };
		Sorter sorter = new SortListAdapter();
		int[] sorted = sorter.sort(numbers);

		for (int i : sorted) {
			System.out.println(i);
		}

	}

}
