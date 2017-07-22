/**
 * 
 */
package chapter1;

/**
 * @author Pratik Sanglikar
 *
 */
public class SumOfFibo {

	public static void main(String args[]) {
		SumOfFiboHelper helper = new SumOfFiboHelper();
		System.out.println(helper.lastDigitOfSum(100));
	}
}

class SumOfFiboHelper {

	private int pisano10 = 60;

	public int lastDigitOfSum(long n) {
		long remainder = n % pisano10;
		long a = 0, b = 1, c = a + b;
		int sum = 0;
		for (int i = 0; i < remainder; i++) {
			sum += c;
			sum = sum % 10;
			c = (a + b) % 10;
			a = b;
			b = c;
		}
		return sum;
	}
}