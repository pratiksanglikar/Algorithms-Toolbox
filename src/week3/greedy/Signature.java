/**
 * 
 */
package week3.greedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Pratik Sanglikar
 *
 */
public class Signature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SignatureHelper helper = new SignatureHelper();
		Timeslot[] timeslots = { new Timeslot(4, 7), new Timeslot(1, 3), new Timeslot(2, 5), new Timeslot(5, 6) };
		helper.calculateMinTrips(timeslots);
	}
}

class SignatureHelper {
	public void calculateMinTrips(Timeslot[] timeslots) {
		ArrayList<Integer> times = new ArrayList<Integer>(2);
		Arrays.sort(timeslots);
		int count = 1;
		times.add(timeslots[0].end);
		int currentTime = timeslots[0].end;
		for (int i = 0; i < timeslots.length; i++) {
			if (currentTime >= timeslots[i].start && currentTime <= timeslots[i].end) {
				// i++;
			} else {
				currentTime = timeslots[i].end;
				count++;
				times.add(timeslots[i].end);
			}
		}
		System.out.println(count);
		for (Integer integer : times) {
			System.out.print(" " + integer);
		}
	}
}

class Timeslot implements Comparable<Timeslot> {
	int start;
	int end;

	/**
	 * 
	 */
	public Timeslot(int start, int end) {
		this.start = start;
		this.end = end;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Timeslot o) {
		return Integer.compare(this.end, o.end);
	}
}