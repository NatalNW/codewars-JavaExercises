package Level_6;

/* 
 * The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing 
 * the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility. 
 * Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater 
 * into an abbreviation, following these rules: 
 * 
 * A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") 
 * will split up a series of letters into two words (eg. "elephant" and "ride"). 
 * The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter 
 * (eg. "elephant ride" => "e6t r2e").
 * 
 * Finished 2019/12/27
 * 
 */
 
public class Abbreviator {

  public String abbreviate(String string) {
        if(string.matches("^\\p{L}{4,}"))
             return string.charAt(0)+""+(string.length()-2)+""+string.charAt(string.length()-1);

        String a10n = "";
        String result = "";
        int i = -1;

        for (Character ch : string.toCharArray()) {
            i++;
            if(ch.toString().matches("\\W|\\d|_") || i == (string.length()-1)){
                a10n += (ch.toString().matches("^\\p{L}")) ? ch : "";
                result += (a10n.length() >= 4) ? a10n.charAt(0)+""+(a10n.length()-2)+""+a10n.charAt(a10n.length()-1) : a10n;
                result += (ch.toString().matches("\\W|\\d|_" )) ? ch : "";
                a10n = "";
                continue;
            }
            a10n += ch;
        }

        return result;
	}

}