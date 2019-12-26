package Level_6;

import java.util.*;
import java.util.stream.Collectors;

/* 
 * John has invited some friends. His list is: 
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 * Could you make a program that makes this string uppercase gives it sorted in alphabetical order by last name. 
 * When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma. 
 * So the result of function meeting(s) will be: 
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)" 
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 * 
 * Finished 2019/12/26
 * 
 */


class Meeting {
    
    public static String meeting(String s) {
        String[] array = s.toUpperCase().split(";");
        List<String> distinctList;
        String pattern;
        List<String> lastName = new ArrayList<>();
        StringBuilder strBdr = new StringBuilder();

        for (String str : array) {
            lastName.add(str.replaceAll("^\\w{1,}:", ""));
        }

        distinctList = lastName.stream().distinct().collect(Collectors.toList());

        Collections.sort(distinctList);
        Arrays.sort(array);

        for (int i = 0; i < distinctList.size(); i++) {
            pattern = String.format(":%s$|:%s;$", distinctList.get(i), distinctList.get(i));
            for (String string : array) {
                if(string.replaceAll("^\\w{1,}:", "").equals(distinctList.get(i)))
                    strBdr.append(String.format("(%s, %s)", distinctList.get(i), string.replaceAll(pattern, "")));
            }
        }

        return strBdr.toString();
    }
}