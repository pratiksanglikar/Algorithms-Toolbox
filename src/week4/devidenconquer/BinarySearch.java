/**
 * 
 */
package week4.devidenconquer;

/**
 * @author Pratik Sanglikar
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchHelper helper = new BinarySearchHelper();
		int[] array = { 1, 2, 3, 7, 9, 12, 55, 67, 88, 98, 110, 117, 129, 165, 178, 199, 210, 220 };
		int key = 67;
		System.out.println(helper.binarySearch(array, key, 0, array.length - 1));
	}
}

class BinarySearchHelper {
	
	public int binarySearch(int[] array, int key, int low, int high) {
		int mid = 0;
		while(low <= high) {
			mid = low + (high - low) / 2;
			if(array[mid] == key) {
				return mid;
			}
			if(array[mid] > key) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
