import java.util.Scanner;

class fiboCal{
	int fibo(int n)
	{
		int F[] = new int[n+2];
		F[0] = 0;
		F[1] = 1;
		for(int i = 2; i<=n; i++) {
			F[i] = F[i-1] + F[i-2];
		}
		return F[n-1];
	}
}
public class fibonacciNum {
	public static void main(String[] args) {
		fiboCal obj = new fiboCal();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();		
		System.out.println(n+"th fibonacciNum number is: "+obj.fibo(n));
	}
}

