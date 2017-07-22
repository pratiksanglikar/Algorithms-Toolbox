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
public class GCD {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		GCD gcd = new GCD();
		int a, b = 0;
		System.out.println("Enter number: ");
		a = Integer.parseInt(gcd.br.readLine());
		System.out.println("Enter number: ");
		b = Integer.parseInt(gcd.br.readLine());
		System.out.println("GCD is " + gcd.getGCD(a, b));
	}
	
	public int getGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}

}
