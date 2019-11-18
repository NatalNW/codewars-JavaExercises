package Level_6;

import java.util.Arrays;

/*
 * There is a queue for the self-checkout tills at the supermarket. 
 * Your task is write a function to calculate the total time 
 * required for all the customers to check out!
 * 
 * Finished 2019/11/14
 */
public class Solution {

	public static int solveSuperMarketQueue(int[] customers, int n) {
		if (customers.length == 0)
			return 0;
		else if (n == 1)
			return Arrays.stream(customers).sum();

		int[] result = new int[n];

		for (int i = 0; i < customers.length; i++) {
			result[0] += customers[i];
			Arrays.sort(result);
		}

		return result[n - 1];
	}
}
