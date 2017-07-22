/**
 * 
 */
package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pratik Sanglikar
 *
 */
public class LastDigitFibonacci {

	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] main) throws NumberFormatException, IOException {
		LastDigitFibonacci ldf = new LastDigitFibonacci();
		int n = Integer.parseInt(ldf.br.readLine());
		System.out.println("Last Digit of Fibonacci is : " + ldf.lastDigitOfFibonacci(n));
	}

	public int lastDigitOfFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		if (this.map.get(n) == null) {
			int lastDigit = (lastDigitOfFibonacci(n - 1) + lastDigitOfFibonacci(n - 2)) % 10;
			this.map.put(n, lastDigit);
		}
		return this.map.get(n);
	}

}
