public class Dashatize {

    public static String dashatize(Integer num) {
      if(num == 0 || num == null)
        return Integer.toString(num);
        
      String str = "";
      int digit = 0;

      for (char d : num.toString().toCharArray()) {
            if(Character.isDigit(d)){
                digit = Character.getNumericValue(d);
                str += (digit % 2==0) ? digit : "-"+digit+"-";
            }
		  }

		  return str.replaceAll("-{1,}", "-").replaceAll("^-|-$", "");
    }

}
