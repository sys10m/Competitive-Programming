import java.lang.Math;
public class BitCounting {

	public static int countBits(int n){
    int count = 0;
    while (n > 0){
      count += (n%2);
      n = (int) Math.floor(n/2);
    }
    return count;
	}
	
}
