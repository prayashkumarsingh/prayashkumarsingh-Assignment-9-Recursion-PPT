package in.ineuron.question5;

public class Question5 {
	public static int maxElement(int A[], int n) {
		if(n == 1)
	        return A[0];
	         
	        return Math.max(A[n-1], maxElement(A, n-1));
	}

	public static void main(String args[]) {
		int A[] = {1, 4, 45, 6, 10, -8};
		int n = A.length;
		System.out.println(maxElement(A, n));
	}

}
