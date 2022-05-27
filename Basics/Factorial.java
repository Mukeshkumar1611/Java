import java.util.Scanner;

public class factorial {
	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = as.nextInt();
		System.out.print("Factorial of " +  a + " is ");
		System.out.print(factorial(a));

	}

}
