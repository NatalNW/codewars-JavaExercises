package Level_6;

/* You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * 
 * Finished 2019/10/21
 */
public class Sort {
	private static int min;

	public static int[] sortArray(int[] array) {
		if (array.length == 0)
			return array;

		for (int i = 0; i < array.length - 1; i++) {
			for (int x = i + 1; x < array.length; x++) {
				if (array[i] % 2 == 1 && array[x] % 2 == 1) {
					if (array[i] > array[x]) {
						min = array[x];
						array[x] = array[i];
						array[i] = min;
					}
				}
			}
		}

		return array;
	}
}
