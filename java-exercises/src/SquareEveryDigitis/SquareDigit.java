/*
 * Welcome. In this kata, you are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out, because 9² is 81 and 1² is 1.
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {
	private String str;
	private int pow;
	private StringBuilder result = new StringBuilder();
	
	public int squareDigits(Integer n) {
		str = n.toString();
	    
		for(int i = 0; i < str.length(); i++) {
			pow = Character.getNumericValue(str.charAt(i));
			result.append(pow*pow);
	    }
		
	    return Integer.parseInt(result.toString());
	}
}
