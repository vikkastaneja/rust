package arrays;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static int binarySearchIndex(int[] arr, int f) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		// Assuming the array is sorted
		int l = 0;
		int r = arr.length - 1;
		int m = (l + r) / 2;
		while (l <= r) {
			if (arr[m] == f) {
				return m;
			}
			
			if (arr[m] < f) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		
		return -1;
	}
}
