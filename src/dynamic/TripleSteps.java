package dynamic;

public class TripleSteps {

	public TripleSteps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(tripleStepsTopDown(4));
		System.out.println(tripleStepsTopDown(5));
		System.out.println(tripleStepsTopDown(6));
		System.out.println(tripleStepsTopDown(7));
		System.out.println(tripleStepsTopDown(8));
		System.out.println(tripleStepsTopDown(9));
		System.out.println(tripleStepsTopDown(10));
		
		System.out.println(tripleStepsBottomUp(4));
		System.out.println(tripleStepsBottomUp(5));
		System.out.println(tripleStepsBottomUp(6));
		System.out.println(tripleStepsBottomUp(7));
		System.out.println(tripleStepsBottomUp(8));
		System.out.println(tripleStepsBottomUp(9));
		System.out.println(tripleStepsBottomUp(10));
	}
	
	public static int tripleStepsBottomUp(int count) {
if (count <= 2) return count;
		
		int []a = new int[count + 1];
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		if (a[count] > 0) return a[count];
		for (int i = 4; i <= count; i++) {
			a[i] = a[i - 1] + a[i - 2] + a[i - 3];
		}
		
		return a[count];
	}
	
	public static int tripleStepsTopDown(int count) {
		if (count <= 2) return count;
		
		int []a = new int[count + 1];
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		
		return tripleSteps(count, a);
	}
	
	private static int tripleSteps(int count, int[]a) {
		if (a[count] > 0) return a[count];
		a[count] = tripleSteps(count - 1, a) + tripleSteps(count - 2, a) + tripleSteps(count - 3, a);
		return a[count];
	}

}
