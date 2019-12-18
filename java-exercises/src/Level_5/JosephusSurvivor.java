package Level_5;

import java.util.ArrayList;
import java.util.List;

/*
 * In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.
 * 
 * Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements
 * like this:
 * josephus_survivor(7,3) => means 7 people in a circle;
 * one every 3 is eliminated until one remains
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out
 * [1,2,4,5,7] => 6 is counted out
 * [1,4,5,7] => 2 is counted out
 * [1,4,5] => 7 is counted out
 * [1,4] => 5 is counted out
 * [4] => 1 counted out, 4 is the last element - the survivor!
 * 
 * Finished 2019/12/18
 */

public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    List<Integer> list = new ArrayList<>();
    int index = -1;
        
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }
        
    while(list.size() > 1){
      index = (index + k) % list.size();
      list.remove(index);
      index -= 1;
    }
  
    return list.get(0);
  }  
}
