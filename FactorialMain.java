import java.util.Scanner;

public class FactorialMain {
	long res = 1;
	long fact(int n)
	{
		for(int i=1; i<=n; i++) {
			res = res*i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		FactorialMain obj = new FactorialMain();
		long res = obj.fact(n);
		System.out.println("Factorial is: "+res);
	}
}
