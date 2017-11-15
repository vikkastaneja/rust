package arrays;

/**
 * Find an element in sorted array that is rotated

1. There are two parts of an array if we take the middle
a) sorted array
b) sorted and rotated array
2. Find if the element is in sorted array or not
3. If the element is in sorted array, then apply binary search
4. Else go to step 1 with a smaller sorted rotated array
 * @author vtaneja
 *
 */
public class SearchRotatedArray {

	public SearchRotatedArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int []a = {176, 188, 199, 200, 210, 222, 1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162};
		System.out.println(searchRotated(a, 210, 0, a.length - 1));
		System.out.println(searchRotated(a, 200, 0, a.length - 1));
		System.out.println(searchRotated(a, 120, 0, a.length - 1));
		System.out.println(searchRotated(a, 188, 0, a.length - 1));
		System.out.println(searchRotated(a, 187, 0, a.length - 1));
		System.out.println(searchRotated(a, 162, 0, a.length - 1));
		System.out.println(searchRotated(a, 176, 0, a.length - 1));
		System.out.println(searchRotated(a, 47, 0, a.length - 1));
	}

	static int searchRotated(int[] a, int s, int l, int r) {
		if (a == null || a.length == 0) {
			return -1;
		}
		
		// Now check if the element is in sorted part of the array
		int m = (l+r) / 2;
		if (a[m] == s) return m;
		
		if (a[m] > a[l] && a[m] > s) {
			return binarySearch(a, s, l, m);
		} else if (a[m] < a[r] && a[r] >= s) {
			return binarySearch(a, s, m, r);
		} else if(s >= a[l]) {
			return searchRotated(a, s, l, m);
		} else {
			return searchRotated(a, s, m, r);
		}
		
	}
	
	static int binarySearch(int []a, int s, int l, int r) {
		int m = 0;
		while (l <= r) {
			m = (l+r) / 2;
			if (a[m] == s) return m;
			if (a[m] > s) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		
		return -1;
	}
}
