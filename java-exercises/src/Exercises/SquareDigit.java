package Exercises;

/*
 * Welcome. In this kata, you are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out, because 9² is 81 and 1² is 1.
 * Note: The function accepts an integer and returns an integer
 * 
 * Finished 2019/10/19
 * Refactored 2019/10/22
 */
public class SquareDigit {
	private final StringBuilder result = new StringBuilder();

	public int squareDigits(Integer n) {
		for (char d : n.toString().toCharArray()) {
			int digit = Character.getNumericValue(d);
			result.append(digit * digit);
		}

		return Integer.parseInt(result.toString());
	}
}
