package Level_6;

import java.util.ArrayList;
import java.util.List;

/*
 * Task:
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave. 
 * You will be passed a string and you must return that string in an array 
 * where an uppercase letter is a person standing up. 
 * 
 * Rules:
 * 1.  The input string will always be lower case but maybe empty.
 * 2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
 * 
 * Finished 2019/11/18
 */
public class MexicanWave {

	public static String[] wave(String str) {
		List<String> w = new ArrayList<String>();
		String wave;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				wave = str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1);
				w.add(wave);
			}
		}

		return w.toArray(new String[0]);
	}
}
