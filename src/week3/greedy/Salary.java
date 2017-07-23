/**
 * 
 */
package week3.greedy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Pratik Sanglikar
 * This solution is incorrect.
 * The question assumes the constraint that the numbers on the piece of paper should
 * be together.
 * This solution doesn't take into consideration that constraint.
 *
 */
public class Salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalaryHelper helper = new SalaryHelper();
		int numbers[] = { 23, 39, 92 };
		System.out.println(helper.calculateSalary(numbers));
	}
}

class SalaryHelper {

	private ArrayList<Integer> brokenInteger = new ArrayList<Integer>();

	public long calculateSalary(int[] array) {
		for (int i : array) {
			breakNumber(i);
		}
		Collections.sort(this.brokenInteger, Collections.reverseOrder());
		long salary = this.brokenInteger.get(0);
		for (int i = 1; i < this.brokenInteger.size(); i++) {
			salary *= 10;
			salary += this.brokenInteger.get(i);
		}
		return salary;
	}

	/**
	 * @param i
	 */
	private void breakNumber(int n) {
		while (n > 0) {
			brokenInteger.add(n % 10);
			n /= 10;
		}
	}
}