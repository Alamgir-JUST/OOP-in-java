import java.util.Scanner;

class Arm{
	
	void armMethod(int num)
	{
		int n = num;
		int sum = 0;
		
		while(n>0) {
			int r = n % 10;
			n = n/10;
			sum = sum + (r *r * r);
		}
		if(num == sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num: ");
		int n = sc.nextInt();
		
		Arm obj = new Arm();
		obj.armMethod(n);

	}
}
