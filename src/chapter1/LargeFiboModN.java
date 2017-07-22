/**
 * 
 */
package chapter1;

public class LargeFiboModN {

	public static void main(String[] args) {
		OtherClass myObject = new OtherClass();
		System.out.print(myObject.getFibModM( 2816213588l, 10));
	}
}

class OtherClass {
	
	
	public long getFibModM(long n, long m) {
		long remainder = n % getPisano(n, m);
		    long first = 0;
		    long second = 1;
		    long res = remainder;
		    for (int i = 1; i < remainder; i++) {
		        res = (first + second) % m;
		        first = second;
		        second = res;
		    }
		    return res % m;
	}

	public long getPisano(long n, long m) {
		long a = 0, b = 1, c = a + b;
		long pisano = 1;
		for(long i = 0; i <= m * m; i++) {
			c = (a + b) % m;
			a = b;
			b = c;
			if(a == 0 && b == 1) {
				pisano = i + 1;
				break;
			}
		}
		System.out.println(pisano);
		return pisano;
	}
}