/**
 * 
 */
package week4.devidenconquer;

/**
 * @author Pratik Sanglikar
 *
 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 4, 6, 8, 4, 5, 6, 2 };
		MajorityElementHelper helper = new MajorityElementHelper();
		System.out.println(helper.majorityElement(array));
	}
}

class MajorityElementHelper {

	public boolean majorityElement(int[] array) {
		int majority = majorityElement(array, 0, array.length - 1);
		if (majority == 0) {
			return false;
		} else {
			System.out.println(majority);
			return true;
		}
	}

	public int majorityElement(int[] array, int low, int high) {
		if (high <= low) {
			return array[low];
		}
		int mid = low + (high - low) / 2;
		int majorityLeft = majorityElement(array, low, mid);
		int majorityRight = majorityElement(array, mid + 1, high);
		if (majorityLeft == majorityRight) {
			return majorityLeft;
		}
		int count = 0;
		for (int i = low; i <= high; i++) {
			if (array[i] == majorityLeft) {
				count++;
			}
		}
		if (count > (high - low) / 2) {
			return majorityLeft;
		}
		count = 0;
		for (int i = low; i <= high; i++) {
			if (array[i] == majorityRight) {
				count++;
			}
		}
		if (count > (high - low) / 2) {
			return majorityRight;
		}
		return 0;
	}
}
