package SumOfDigits;
/*
 * In this kata, you must create a digital root function.
 * 
 * A digital root is the recursive sum of all the digits in a number. 
 * Given n, take the sum of the digits of n. If that value has more than one digit, 
 * continue reducing in this way until a single-digit number is produced. 
 * This is only applicable to the natural numbers.
 * 
 * Finished 2019/10/23
 */
public class DigitalRoot {

	public static int digitalRoot(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		if (sum >= 10) {
			while (sum != 0) {
				n += sum % 10;
				sum /= 10;
			}
		}

		return sum == 0 ? n : sum;
	}
}
