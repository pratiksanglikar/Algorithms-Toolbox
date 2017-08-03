/**
 * 
 */
package week4.devidenconquer;

/**
 * @author Pratik Sanglikar
 *
 */
public class BinarySearchRecursive {

	public static void main(String[] args) {
		BSRecursiveHelper helper = new BSRecursiveHelper();
		int[] array = { 1, 2, 3, 7, 9, 12, 55, 67, 88, 98, 110, 117, 129, 165, 178, 199, 210, 220 };
		int key = 12;
		System.out.println(helper.binarySearch(array, key));
	}
}

class BSRecursiveHelper {

	public int binarySearch(int[] array, int key) {
		return binarySearchRec(array, key, 0, array.length-1);
	}

	private int binarySearchRec(int[] array, int key, int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				return binarySearchRec(array, key, low, mid - 1);
			} else {
				return binarySearchRec(array, key, mid + 1, high);
			}
		}
		return -1;
	}
}
