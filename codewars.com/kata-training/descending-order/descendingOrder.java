import java.util.*;
import java.lang.Math;
public class DescendingOrder {
  public static int sortDesc(final int num) {
    ArrayList<Integer> digits = getDigitArr(num);
    Collections.sort(digits, Collections.reverseOrder());
    int returnValue = 0;
    for (int i = 0; i < digits.size(); i++){
      returnValue *= 10;
      returnValue += digits.get(i);
    }
    return returnValue;
  }
  public static ArrayList<Integer> getDigitArr(int num){
    ArrayList<Integer> digits = new ArrayList<Integer>();
    while (num > 0){
      digits.add(num % 10);
      num = (int) Math.floor(num/10);
    }
    return digits;
  }
}
