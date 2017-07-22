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
public class Fibonacci {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Map<Integer, Long> map = new HashMap<Integer, Long>();

	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.println("Enter number: ");
//		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<62;i++) {
			System.out.println("i : " + i + " LastDigit: " + fibonacci(i) % 10);
		}
	}

	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		long fibo = 0;
		if (null == map.get(n)) {
			fibo = fibonacci(n - 1) + fibonacci(n - 2);
			map.put(n, fibo);
		}
		return map.get(n);
	}
}
