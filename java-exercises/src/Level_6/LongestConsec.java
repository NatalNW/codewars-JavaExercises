package Level_6;

/*
 * You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * Example:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 * 
 * Note
 * consecutive strings : follow one after another without an interruption
 * 
 * 
 * Finished 2019/10/24
 * 
 * I DONT KNOW HOW IT WORKS, BUT WORKS!!
 */
public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		String longConSec = "";
		boolean stop = false;
		int maxLength = 0;
		String maxConsec = "";

		for (int i = 0; i < strarr.length; i++) {
			longConSec = "";

			for (int j = 0; j < k; j++) {
				if (i + j >= strarr.length) {
					stop = true;
					break;
				}

				longConSec += strarr[i + j];
			}

			if (stop)
				break;
			else if (longConSec.length() > maxLength) {
				maxLength = longConSec.length();
				maxConsec = longConSec;
			}

		}

		return (strarr.length == 0 || k > strarr.length || k <= 0) ? "" : maxConsec;
	}
}
