package ConsecutiveStrings;

public class Main {

	public static void main(String[] args) {
		/* Consecutive strings */
		System.out.println("1 "+LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
		System.out.println("2 "+LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
		System.out.println("4 "+LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
		System.out.println("5 "+LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
		System.out.println("7 "+LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
	}
}
