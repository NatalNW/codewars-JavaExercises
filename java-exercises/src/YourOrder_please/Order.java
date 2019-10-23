package YourOrder_please;
/*
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 *
 * Finished 2019/10/21
 */
public class Order {
	private static String[] arrOfWords;
	private static String[] sortedWords;
	private static String finalWords;
	private static StringBuilder bdrWords;

	public static String order(String words) {
		if (words == "")
			return "";

		bdrWords = new StringBuilder();
		arrOfWords = words.split(" ");
		sortedWords = words.split(" ");

		for (int i = 0; i < arrOfWords.length; i++) {
			finalWords = arrOfWords[i];
			if (finalWords.contains("1")) {
				sortedWords[0] = finalWords;
			} else if (finalWords.contains("2")) {
				sortedWords[1] = finalWords;
			} else if (finalWords.contains("3")) {
				sortedWords[2] = finalWords;
			} else if (finalWords.contains("4")) {
				sortedWords[3] = finalWords;
			} else if (finalWords.contains("5")) {
				sortedWords[4] = finalWords;
			} else if (finalWords.contains("6")) {
				sortedWords[5] = finalWords;
			} else if (finalWords.contains("7")) {
				sortedWords[6] = finalWords;
			} else if (finalWords.contains("8")) {
				sortedWords[7] = finalWords;
			} else {
				sortedWords[8] = finalWords;
			}
		}

		for (String string : sortedWords) {
			bdrWords.append(string + " ");
		}

		finalWords = bdrWords.toString();

		return finalWords.replaceAll(" $", "");
	}
}
