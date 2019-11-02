class ReverseChecker{
	void reverse(int num)
	{
		int sum = 0;
		int n = num;
		while(n>0) {
			int r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		if(num == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
public class ReverseNum {
	public static void main(String[] args) {		
		ReverseChecker obj = new ReverseChecker();
		obj.reverse(1551);
	}
}
