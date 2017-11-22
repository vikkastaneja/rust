package arrays;

import java.util.*;

/**
 * Given an array of integers, rotate the array by 'N' elements.
 * @author vtaneja
 *
 */
public class RotateArray {

	public RotateArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4,5};
		rotateArraySol2(a, 3);
		System.out.println(Arrays.toString(a));
	}

	public static void rotateArraySol1(int[] a, int r) {
		if (a == null || a.length == 0) {
			return;
		}

		BitSet b = new BitSet(a.length);
		for (int i = a.length - 1; i >= 0; i--) {
			int temp = a[i];
			int j = (a.length + i - r) % a.length;
			while (!b.get(j)) {
				int t = a[j];
				a[j] = temp;
				temp = t;
				b.set(j);
				j = (a.length + j - r) % a.length;
			}
		}
	}
	
	public static void rotateArraySol2(int []a, int r) {
		if (a == null || a.length == 0) {
			return;
		}
		
		reverse(a, 0, a.length - 1);
		reverse(a, 0, a.length - r);
		reverse(a, a.length - r + 1, a.length - 1);
		
	}
	
	private static void reverse(int []a, int s, int e) {
		while (s < e) {
			int t = a[s];
			a[s] = a[e];
			a[e] = t;
			s++;
			e--;
		}
	}
}
