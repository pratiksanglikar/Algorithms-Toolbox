/**
 * 
 */
package chapter1;

/**
 * @author Pratik Sanglikar
 *
 */
public class FiboPartialSum {
	public static void main(String[] args) {
		FiboPartialSumHelper helper = new FiboPartialSumHelper();
		System.out.println(helper.lastDigitPartialSum(10, 200));
	}
}

class FiboPartialSumHelper {

	private final int pisano10 = 60;

	public int lastDigitPartialSum(int m, int n) {
		long a = 0, b = 1, c = a + b;
		int sum = 0;
		int mRem = m % pisano10;
		int nRem = n % pisano10;
		int minR = nRem > mRem ? mRem : nRem;
		int maxR = nRem > mRem ? nRem : mRem;
		for (int i = 0; i < maxR; i++) {
			if(i >= minR-1) {
				sum += c;
				sum %= 10;
			}
			c = (a + b) % 10;
			a = b;
			b = c;
		}
		return sum;
	}
}
