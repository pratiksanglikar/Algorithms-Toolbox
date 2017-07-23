/**
 * 
 */
package week3.greedy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Pratik Sanglikar
 *
 */
public class MaxRevenue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxRevenueHelper helper = new MaxRevenueHelper();
		int[] profitPerClick = { 1, 3, -5 };
		int[] numberOfClicks = { -2, 4, 1 };
		System.out.println(helper.calculateMaxRevenue(profitPerClick, numberOfClicks));
	}
}

class MaxRevenueHelper {

	public long calculateMaxRevenue(int[] profitPerClick, int[] numberOfClicks) {
		ArrayList<Integer> positivePPC = new ArrayList<Integer>();
		ArrayList<Integer> positiveClicks = new ArrayList<Integer>();
		ArrayList<Integer> negativePPC = new ArrayList<Integer>();
		ArrayList<Integer> negativeClicks = new ArrayList<Integer>();
		for (int i = 0; i < profitPerClick.length; i++) {
			if (profitPerClick[i] > 0) {
				positivePPC.add(profitPerClick[i]);
			} else {
				negativePPC.add(profitPerClick[i]);
			}
			if (numberOfClicks[i] > 0) {
				positiveClicks.add(numberOfClicks[i]);
			} else {
				negativeClicks.add(numberOfClicks[i]);
			}
		}
		return getMaxRevenue(positivePPC, positiveClicks, true) + getMaxRevenue(negativePPC, negativeClicks, false);
	}

	private long getMaxRevenue(ArrayList<Integer> profitPerClick, ArrayList<Integer> clicks, boolean positive) {
		long revenue = 0;
		if (!positive) {
			Collections.sort(profitPerClick);
			Collections.sort(clicks);
		} else {
			Collections.sort(profitPerClick, Collections.reverseOrder());
			Collections.sort(clicks, Collections.reverseOrder());
		}
		int min = profitPerClick.size() > clicks.size() ? clicks.size() : profitPerClick.size();
		for (int i = 0; i < min; i++) {
			revenue += (profitPerClick.get(i) * clicks.get(i));
		}
		return revenue;
	}
}
