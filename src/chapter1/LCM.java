/**
 * 
 */
package chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pratik Sanglikar
 *
 */
public class LCM {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		LCM lcm = new LCM();
		int a, b;
		System.out.println("Enter number: ");
		a = Integer.parseInt(lcm.br.readLine());
		System.out.println("Enter number: ");
		b = Integer.parseInt(lcm.br.readLine());
		System.out.println("GCD is " + lcm.getLCM(a, b));
	}
	
	public int getLCM(int a, int b) {
		long product = a * b;
		long lcm = product / getGCD(a, b);
		return (int) lcm;
	}
	
	private int getGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}
}
