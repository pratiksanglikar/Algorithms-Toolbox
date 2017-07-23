/**
 * 
 */
package week3.greedy;

/**
 * @author Pratik Sanglikar
 *
 */
public class ChangingCoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChaningCoinsHelper helper = new ChaningCoinsHelper();
		System.out.println(helper.getNumberOfCoins(28));
	}

}

class ChaningCoinsHelper {
	
	private final int[] COINS = {10, 5, 1}; 
	
	public int getNumberOfCoins(long m) {
		int numberOfCoins = 0;
		while(m > 0) {
			for(int i=0;i<COINS.length;i++) {
				long rem = m / COINS[i];
				numberOfCoins += (int) rem;
				m -= (rem * COINS[i]);
				System.out.println(rem + " coins of denomination " + COINS[i] + " taken. Total coins: " + numberOfCoins);
			}
		}
		return numberOfCoins;
	}
}
