/**
 * 
 */
package chapter1;

import java.util.Scanner;

/**
 * @author Pratik Sanglikar
 *
 */
public class Assignment1 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + b);
	}
}
