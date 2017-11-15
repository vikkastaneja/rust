package arrays;

import java.util.*;

public class ReturnMaxFromWindow {

	public ReturnMaxFromWindow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[]a = {-4, 2, -5, 3, 6, 10, 20, 6, 15, 35};
		System.out.println(getMaxFromWindow(a, 3, 7));
	}

	static int getMaxFromWindow(int []a, int w, int step) {
		if (a == null || a.length == 0 || w <= 0) {
			return Integer.MIN_VALUE;
		}
		
		int current = 0;
		List<Integer> l = new ArrayList<Integer>();
		
		// First parse first step width
		while (current < w) {
			if (l.size() == 0 || w > current) {
				if (l.size() > 0 && l.get(0) < a[current]) {
					l.add(0, a[current]);
				} else if (l.size() == 0) 
					l.add(a[current]);
				
				current++;
			}

		}
		
		step--;
		for (int i = w; i < a.length && step > 0; i++, step--) {
			
			if (l.get(0) == a[i-w]) {
				l.remove(0);
			}
			
			if (l.get(0) < a[i]) {
				l.add(0, a[i]);
			}
		}
		
		return l.get(0);
	}
}
