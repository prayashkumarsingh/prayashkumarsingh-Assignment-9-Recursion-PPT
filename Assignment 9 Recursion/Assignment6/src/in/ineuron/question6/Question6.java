package in.ineuron.question6;

public class Question6 {
	public static int Nth_of_AP(int A, int D, int N) {
		return (A + (N - 1) * D);
	}

	public static void main(String[] args) {
		int A = 2;
		int D = 1;
		int N = 5;
		System.out.print("The " + N + "th term of the series is : " + Nth_of_AP(A, D, N));
	}

}
