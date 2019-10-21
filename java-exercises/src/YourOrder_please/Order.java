package YourOrder_please;

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
				arrOfWords[6] = finalWords;
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
