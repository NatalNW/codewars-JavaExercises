package Level_6;
/* 
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. 
 * Each book has a code c of 3, 4, 5 or more capitals letters. 
 * The 1st letter of a code is the capital letter of the book category. 
 * In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) 
 * which indicates the quantity of books of this code in stock.
 * 
 * Finished  2019/12/16
 */
public class StockList { 
	
    // 1st parameter is the stocklist (L in example), 
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0)
            return "";
        
        int[] t = new int[lstOf1stLetter.length];
        StringBuilder str = new StringBuilder();
        
        for (int i=0; i < lstOf1stLetter.length;i++) {
            for (int j =0; j < lstOfArt.length;j++) {
                if(lstOfArt[j].charAt(0) == lstOf1stLetter[i].charAt(0)){
                    t[i] += Integer.parseInt(lstOfArt[j].replaceAll("\\D{1,}", ""));
                }
            }

            str.append(String.format("(%s : %d) - ", lstOf1stLetter[i] ,t[i]));
        }
        
        return (str.length() == 0) ? "" : str.replace(str.length()-3, str.length(), "").toString();
    }
}
  