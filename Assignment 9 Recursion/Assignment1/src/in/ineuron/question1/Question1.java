package in.ineuron.question1;

public class Question1 {
	public static boolean power(int n) {
	    return n < 0 ? false : Integer.bitCount(n) == 1;
	  }
	public static void main(String [] args)
	{
		int n = 32;
		System.out.println(power(n));
	}

}
