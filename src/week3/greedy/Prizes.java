/**
 * 
 */
package week3.greedy;

import java.util.ArrayList;

/**
 * @author Pratik Sanglikar
 *
 */
public class Prizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrizesHelper helper = new PrizesHelper();
		helper.viewOptimalPrizes(2);
	}
}

class PrizesHelper {
	
	public void viewOptimalPrizes(long n) {
		ArrayList<Integer> prizesList = new ArrayList<Integer>(0);
		for(int i = 1; n > 0; i++) {
			if(n >= i) {
				n -= i;
				prizesList.add(i);
			} else {
				prizesList.set(prizesList.size() - 1, (int) ((i - 1) + n));
				n = 0;
			}
		}
		System.out.println(prizesList.size());
		for (Integer integer : prizesList) {
			System.out.print(" " + integer);
		}
	}
}
