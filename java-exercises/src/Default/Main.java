package Default;

import Exercises.MexicanWave;

public class Main {

	public static void main(String[] args) {
		/* Mexican Wave */
		for(String wave : MexicanWave.wave("two words")) {
			System.out.println(wave);
		}
		
		for(String wave : MexicanWave.wave(" gap ")) {
			System.out.println(wave);
		}
		
//		/* Your order, please */
//		System.out.println(Order.order("wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor"));
//		
//		/* The Supermarket Queue */
//		System.out.println(Solution.solveSuperMarketQueue(new int[] { 2,3,10}, 2));
//
//		/* Sum of Digits / Digital Root */
//		System.out.println(DigitalRoot.digitalRoot(16));
//		System.out.println(DigitalRoot.digitalRoot(456));
//		
//		/* Square Every Digits */
//		System.out.println(new SquareDigit().squareDigits(9119));
//		
//		/* Sort the odd */
//		int[] array =  Sort.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
//		System.out.println("--");
//		for (int i : array) {
//			System.out.println(i);
//		}
//		
//		/* Dubstep */
//		System.out.println(Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
//		System.out.println(Dubstep.SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
//		System.out.println(Dubstep.SongDecoder("WUBWUBABCWUB"));
//		
//		/* Consecutive strings */
//		System.out.println("1 "+LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
//		System.out.println("2 "+LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
//		System.out.println("4 "+LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
//		System.out.println("5 "+LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
//		System.out.println("7 "+LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
	}
}
