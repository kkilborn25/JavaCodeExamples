//Katherine (Katie) Kilborn
public class FlameWar {
	//static count variable
	//keeps track of number of iterations/recursions
	static int count=0;
	//Iterative power method
	public static double IterativePower(double x, int n) {
		double pow=1;
		count=0;
		if (n==0) {
			count++;
			return 1;
		}
		else if (n<0) {
			n=-1*n;
			for (int i=0; i<n; i++) {
				pow=x*pow;
				count++;
			}
			return 1/pow;
		}
		else {
			for (int i=0; i<n; i++) {
				pow=x*pow;
				count++;
			}
			return pow;	
		}
	}
	//recursive power method
	public static double RecursivePower(double x, int n) {
		count++;
		if (n==0) {
			return 1;
		}
		if(n<0) {
			return (1/RecursivePower(x,-n));
		}
		else {
			return x*RecursivePower(x,n-1);
		}
	}
	//Iterative Palindrome
	public static boolean checkPalindromeI(String input) {
		count=0;
		int j=input.length();
		for (int i=0; i<j; i++) {
			count++;
			if (input.charAt(i)!=(input.charAt(j-i-1))) {
				return false;
			}
		}
		return true;
	}
	//Recursive Palindrome
	public static boolean checkPalindromeR(String input) {
		count++;
		if (input.length()<=1) {
			count++;
			return true;
		}
		else {
			if (input.charAt(0)==input.charAt(input.length()-1)) {
				return checkPalindromeR(input.substring(1, input.length()-1));
			}
			else {
				return false;
			}
		}
	}
	//Iterative Summation
	public static int iterativeSummation(int n) {
		count=0;
		int total=0;
		for (int i=1; i<=n; i++) {
			count++;
			total=total+i;
		}
		return total;
	}
	//Recursive Summation
	public static int recursiveSummation(int n) {
		count++;
		if (n==0) {
			return 0;
		}
		else {
			return n+recursiveSummation(n-1);
		}
	}
	//Main Method
	public static void main(String[] args) {
		//power methods
		System.out.println("Iterative Power: " + IterativePower(3.0,2));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Power: " + RecursivePower(3.0,2));
		System.out.println("Count: " + count);
		//System.out.println();
		System.out.println("Iterative Power: " + IterativePower(3.0,-1));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Power: " + RecursivePower(3.0,-1));
		System.out.println("Count: " + count);
		//System.out.println();
		System.out.println("Iterative Power: " + IterativePower(3.0,0));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Power: " + RecursivePower(3.0,0));
		System.out.println("Count: " + count);
		System.out.println();
		//palindrome methods
		System.out.println("Iterative Palindrome: " + checkPalindromeI("kayak"));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Palindrome: " + checkPalindromeR("kayak"));
		System.out.println("Count: " + count);
		System.out.println("Iterative Palindrome: " + checkPalindromeI("cat"));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Palindrome: " + checkPalindromeR("cat"));
		System.out.println("Count: " + count);
		System.out.println();
		//summation methods
		System.out.println("Iterative Summation: " + iterativeSummation(0));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Summation: " + recursiveSummation(0));
		System.out.println("Count: " + count);
		System.out.println("Iterative Summation: " + iterativeSummation(3));
		System.out.println("Count: " + count);
		count=0;
		System.out.println("Recursive Summation: " + recursiveSummation(3));
		System.out.println("Count: " + count);
	}

}
