import java.util.Scanner;

class primeck{

	int prime(int n)
	{
		int ck = 1;
		if(n<2) {
			ck = 0;
		}
		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				ck = 0;
				break;
			}
		}
		return ck;
	}
}
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		primeck obj = new primeck();
		int res = obj.prime(n);
		if(res == 1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
