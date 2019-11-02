package Abstraction;
public class User1 extends MobileUser{
	@Override
	void sendMessage() {
		System.out.println("This is user One!!!");		
	}	
	public static void main(String[] args) {
		MobileUser mUser;	
		mUser = new User1();
		mUser.sendMessage();
	}
}
