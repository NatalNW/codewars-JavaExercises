package SortTheOdd;
public class Main {

	public static void main(String[] args) {
		/* Sort the odd */
		int[] array =  Sort.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
		System.out.println("--");
		for (int i : array) {
			System.out.println(i);
		}
	}
}
