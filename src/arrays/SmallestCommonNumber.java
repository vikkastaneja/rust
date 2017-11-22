package arrays;

/**
 * Given three integer arrays sorted in ascending order, find the smallest number that is common in all three arrays.
 * @author vtaneja
 *
 */
public class SmallestCommonNumber {

	public SmallestCommonNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {0, 1, 2, 3, 5, 6, 7};
		int []b = {-1, 2, 3, 10, 11, 12, 13};
		int []c = {-2, -1, 3, 4, 5};
		System.out.println(getSmallestEqual(a, b, c));

	}

	public static int getSmallestEqual(int[]a, int[]b, int[]c) {
	  if (a == null || b == null || c == null || a.length == 0 || b.length == 0 || c.length == 0)
	    return Integer.MIN_VALUE;

	  for (int i = 0, j = 0, k = 0; i < a.length && j < b.length && k < c.length;) {
	    if (a[i] == b[j] && b[j] == c[k])
	      return a[i];

	    if (a[i] < b[j]) {
	      if (a[i] < c[k]) {
	        i++;
	        continue;
	      }
	    } else if (b[j] < c[k]) {
	      j++;
	      continue;
	    } else if (c[k] < a[i]) {
	      k++;
	      continue;
	    } else {
	      j++;
	    }
   
	  }
	  
	  return Integer.MIN_VALUE;
	}
}
